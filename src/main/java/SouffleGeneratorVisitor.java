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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SouffleGeneratorVisitor extends SouffleBaseVisitor<SouffleSymbol> {

    private final String documentUri;
    SouffleParser parser;
    SouffleContext documentContext;
    ProjectContext projectContext;
    ArrayDeque<ArrayDeque<SouffleSymbol>> currentScope;
    ArrayDeque<SouffleContext> currentContext;

    public SouffleGeneratorVisitor(SouffleParser parser, String documentContext, ProjectContext projectContext) {
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
    public SouffleSymbol visitRelation_decl(SouffleParser.Relation_declContext ctx) {
        SouffleContext declarationContext = new SouffleContext(SouffleContextType.RELATION_DECL,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        documentContext.addToSubContext(declarationContext);
        String documentation = null;
        Token semi = ctx.getStart();
        int i = semi.getTokenIndex();
        BufferedTokenStream tokens = (BufferedTokenStream)parser.getTokenStream();
        List<Token> cmtChannel =
                tokens.getHiddenTokensToLeft(i, SouffleLexer.HIDDEN);
        if ( cmtChannel!=null ) {
            Token cmt = cmtChannel.get(0);
            if ( cmt!=null ) {
                documentation = cmt.getText().replaceAll("\\*", "").replaceAll("/", "").trim();
            }
        }

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
        declarationContext.addContextSymbol(typeName);
        declarationContext.addToContextScope(typeName);
        documentContext.addToContextScope(typeName);
        documentContext.addToSubContext(declarationContext);
        System.err.println(documentContext);

        return super.visitType_decl(ctx);
    }

    @Override
    public SouffleSymbol visitRecord_type_list(SouffleParser.Record_type_listContext ctx) {
        currentScope.push(new ArrayDeque<>());
        super.visitRecord_type_list(ctx);
        currentScope.pop();
        return null;
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

        return new SouffleVariable(name, type, toRange(ctx.IDENT()));
    }

    @Override
    public SouffleSymbol visitQualified_name(SouffleParser.Qualified_nameContext ctx) {
        return new SouffleSymbol(ctx.IDENT().getText(), SouffleSymbolType.VARIABLE, toRange(ctx));
    }
}
