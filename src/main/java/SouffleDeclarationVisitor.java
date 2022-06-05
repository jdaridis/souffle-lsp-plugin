import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import visitors.SouffleBaseVisitor;
import visitors.SouffleLexer;
import visitors.SouffleParser;

import java.util.ArrayDeque;
import java.util.List;

public class SouffleDeclarationVisitor extends SouffleBaseVisitor<SouffleSymbol> {

    private final String documentUri;
    SouffleParser parser;
    SouffleContext documentContext;
    SouffleProjectContext projectContext;
    ArrayDeque<ArrayDeque<SouffleSymbol>> currentScope;
    ArrayDeque<SouffleContext> currentContext;

    public SouffleDeclarationVisitor(SouffleParser parser, String documentContext, SouffleProjectContext projectContext) {
        this.parser = parser;
        this.currentScope = new ArrayDeque<>();
        this.currentContext  = new ArrayDeque<>();
        this.documentUri = documentContext;
        this.documentContext = projectContext.getDocumentContext(documentContext);
        this.projectContext = projectContext;
    }


    public SouffleContext getDocumentContext() {
        return documentContext;
    }

    public Range toRange(ParserRuleContext ctx){
        Position start = new Position(ctx.getStart().getLine() - 1, ctx.getStart().getCharPositionInLine());
        Position end = new Position(ctx.getStop().getLine() - 1, ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length());
        return new Range(start, end);
    }
    public Range toRange(TerminalNode ctx){
        Position start = new Position(ctx.getSymbol().getLine() - 1, ctx.getSymbol().getCharPositionInLine());
        Position end = new Position(ctx.getSymbol().getLine() - 1, ctx.getSymbol().getCharPositionInLine() + ctx.getSymbol().getText().length());
        return new Range(start, end);
    }

    private String getDocumentation(Token ctx) {
        String documentation = null;
        int i = ctx.getTokenIndex();
        BufferedTokenStream tokens = (BufferedTokenStream)parser.getTokenStream();
        List<Token> cmtChannel =
                tokens.getHiddenTokensToLeft(i, SouffleLexer.HIDDEN);
        if ( cmtChannel!=null ) {
            Token cmt;
            if(cmtChannel.get(0).getType() == SouffleParser.LINE_COMMENT){
                cmt = cmtChannel.get(0);
            } else {
                cmt = cmtChannel.get(cmtChannel.size() - 1);
            }
            if ( cmt!=null ) {
                documentation = cmt.getText().replaceAll("\\*", "").replaceAll("/", "").trim();
            }
        }
        return documentation;
    }

    @Override
    public SouffleSymbol visitProgram(SouffleParser.ProgramContext ctx) {
        documentContext = new SouffleContext(SouffleContextType.DOCUMENT, toRange(ctx));
        currentContext.push(documentContext);
//        System.err.println(ctx.toStringTree(parser));

        super.visitProgram(ctx);

//        System.err.println(documentContext);
        return null;
    }

    @Override
    public SouffleSymbol visitComponent_decl(SouffleParser.Component_declContext ctx) {
        SouffleContext componentContext = new SouffleContext(SouffleContextType.COMPONENT,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        currentContext.push(componentContext);
        documentContext.addToSubContext(componentContext);
        String documentation = getDocumentation(ctx.getStart());
        SouffleComponent contextSymbol = (SouffleComponent) ctx.component_head().accept(this);
        contextSymbol.setURI(documentUri);
        contextSymbol.setDocumentation(documentation);
        componentContext.addContextSymbol(contextSymbol);
        documentContext.addToContextScope(contextSymbol);
        ctx.component_body().accept(this);
        currentContext.pop();
        return null;
    }

    @Override
    public SouffleSymbol visitComponent_head(SouffleParser.Component_headContext ctx) {
        SouffleSymbol symbol;
        if(ctx.component_head() != null){
            symbol = ctx.component_head().accept(this);
        } else {
            symbol = ctx.component_type().accept(this);
        }
        return new SouffleComponent(symbol.getName(), symbol.getRange(), true);
    }

    @Override
    public SouffleSymbol visitComponent_type(SouffleParser.Component_typeContext ctx) {
        if(ctx.IDENT() != null)
            return new SouffleSymbol(ctx.IDENT().getText(), SouffleSymbolType.VARIABLE, toRange(ctx.IDENT()));
        else
            return new SouffleSymbol(ctx.PREPROCESSOR_ID().getText(), SouffleSymbolType.VARIABLE, toRange(ctx.PREPROCESSOR_ID()));
    }

    @Override
    public SouffleSymbol visitRelation_decl(SouffleParser.Relation_declContext ctx) {
        SouffleContext declarationContext = new SouffleContext(SouffleContextType.RELATION_DECL,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        documentContext.addToSubContext(declarationContext);
        String documentation = getDocumentation(ctx.getStart());

        currentScope.push(new ArrayDeque<>());
        ctx.relation_names().accept(this);
        ArrayDeque<SouffleSymbol> relationNames = currentScope.pop();

        currentScope.push(new ArrayDeque<>());
        ctx.attributes_list().accept(this);
        ArrayDeque<SouffleSymbol> attributes = currentScope.pop();

        boolean firstPass = true;
        for(SouffleSymbol relationName: relationNames){
            SouffleRelation relation = new SouffleRelation(relationName.getName(), relationName.getRange(), true);
            relation.setDocumentation(documentation);
            for(SouffleSymbol attribute: attributes){
                SouffleVariable arg = (SouffleVariable) attribute;
                relation.addArg(arg);

                if(firstPass){
                    SouffleContext variableContext = new SouffleContext(SouffleContextType.VARIABLE, new Range(arg.getRange().getStart(), arg.getRange().getEnd()));
                    SouffleContext typeContext = new SouffleContext(SouffleContextType.TYPE, new Range(arg.getType().getRange().getStart(), arg.getType().getRange().getEnd()));
                    variableContext.addContextSymbol(arg);
                    typeContext.addContextSymbol(arg.getType());

                    declarationContext.addToContextScope(attribute);
                    declarationContext.addToContextScope(arg.getType());

                    declarationContext.addToSubContext(variableContext);
                    declarationContext.addToSubContext(typeContext);
                }

            }
            firstPass = false;
            documentContext.addToContextScope(relation);
            declarationContext.addContextSymbol(relation);
        }

//        System.err.println(declarationContext);
        return null;
    }

    @Override
    public SouffleSymbol visitRelation_names(SouffleParser.Relation_namesContext ctx) {
        SouffleSymbol relationName = new SouffleSymbol(ctx.IDENT().getText(), SouffleSymbolType.VARIABLE, toRange(ctx));
        assert currentScope.peek() != null;
        currentScope.peek().push(relationName);
        return super.visitRelation_names(ctx);
    }

    @Override
    public SouffleSymbol visitType_decl(SouffleParser.Type_declContext ctx) {
        SouffleContext declarationContext = new SouffleContext(SouffleContextType.TYPE,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();

        SouffleType typeName = new SouffleType(ctx.IDENT().getText(), toRange(ctx.IDENT()), true);
        typeName.setURI(documentUri);
        declarationContext.addContextSymbol(typeName);
        declarationContext.addToContextScope(typeName);
        documentContext.addToContextScope(typeName);
        documentContext.addToSubContext(declarationContext);

        if(ctx.union_type_list() != null){
            currentScope.push(new ArrayDeque<>());
            ctx.union_type_list().accept(this);
            ArrayDeque<SouffleSymbol> types = currentScope.pop();
            for(SouffleSymbol typeSymbol: types){
                SouffleType type = new SouffleType(typeSymbol.getName(), typeSymbol.getRange());
                SouffleContext unionContext = new SouffleContext(SouffleContextType.TYPE, type.getRange());
                unionContext.addContextSymbol(type);
                unionContext.addToContextScope(type);
                declarationContext.addToSubContext(unionContext);
                declarationContext.addToContextScope(type);
                typeName.addType(type);
            }
        }
        return null;
    }

    @Override
    public SouffleSymbol visitRecord_type_list(SouffleParser.Record_type_listContext ctx) {
        currentScope.push(new ArrayDeque<>());
        super.visitRecord_type_list(ctx);
        currentScope.pop();
        return null;
    }

    @Override
    public SouffleSymbol visitUnion_type_list(SouffleParser.Union_type_listContext ctx) {
        SouffleSymbol type = ctx.qualified_name().accept(this);
        assert currentScope.peek() != null;
        currentScope.peek().push(type);
        return super.visitUnion_type_list(ctx);
    }

    @Override
    public SouffleSymbol visitAdt_branch(SouffleParser.Adt_branchContext ctx) {
        currentScope.push(new ArrayDeque<>());
        super.visitAdt_branch(ctx);
        currentScope.pop();
        return null;
    }

    @Override
    public SouffleSymbol visitNon_empty_attributes(SouffleParser.Non_empty_attributesContext ctx) {
        SouffleVariable attribute = (SouffleVariable) ctx.attribute().accept(this);
        assert currentScope.peek() != null;
        currentScope.peek().push(attribute);
        return super.visitNon_empty_attributes(ctx);
    }

    @Override
    public SouffleSymbol visitAttribute(SouffleParser.AttributeContext ctx) {
        String name = ctx.IDENT().getText();
        SouffleSymbol typeSymbol = ctx.qualified_name().accept(this);

        SouffleType type = new SouffleType(typeSymbol.getName(), typeSymbol.getRange());
        type.setComponent(typeSymbol.getComponent());
        return new SouffleVariable(name, type, toRange(ctx.IDENT()));
    }

    @Override
    public SouffleSymbol visitQualified_name(SouffleParser.Qualified_nameContext ctx) {
        if(ctx.preprocessor_macro() != null){
            return ctx.preprocessor_macro().accept(this);
        }

        SouffleSymbol symbol = new SouffleSymbol(ctx.IDENT().getText(), SouffleSymbolType.VARIABLE, toRange(ctx));
        if(ctx.qualified_name() != null){
            SouffleSymbol component = ctx.qualified_name().accept(this);
            symbol.setComponent(component);
        }
        return symbol;
    }

    @Override
    public SouffleSymbol visitPreprocessor_macro(SouffleParser.Preprocessor_macroContext ctx) {
        return new SouffleSymbol(ctx.getText(), SouffleSymbolType.VARIABLE, toRange(ctx));
    }
}
