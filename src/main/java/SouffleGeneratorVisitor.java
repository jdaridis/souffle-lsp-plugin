import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import visitors.SouffleBaseVisitor;
import visitors.SouffleParser;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SouffleGeneratorVisitor extends SouffleBaseVisitor<SouffleSymbol> {

    SouffleParser parser;
    SouffleContext documentContext;

    ArrayDeque<List<SouffleSymbol>> currentScope;
    ArrayDeque<SouffleContext> currentContext;

    public SouffleGeneratorVisitor(SouffleParser parser) {
        this.parser = parser;
        this.currentScope = new ArrayDeque<>();
        this.currentContext  = new ArrayDeque<>();
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
        System.err.println(ctx.toStringTree(parser));

        super.visitProgram(ctx);

        System.err.println(documentContext);
        return null;
    }

    @Override
    public SouffleSymbol visitRelation_decl(SouffleParser.Relation_declContext ctx) {
        SouffleContext declarationContext = new SouffleContext(SouffleContextType.RELATION_DECL,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        documentContext.addToSubContext(declarationContext);

        currentScope.push(new ArrayList<>());
        ctx.relation_names().accept(this);
        List<SouffleSymbol> relationNames = currentScope.pop();

        currentScope.push(new ArrayList<>());
        ctx.attributes_list().accept(this);
        List<SouffleSymbol> attributes = currentScope.pop();

        boolean firstPass = true;
        for(SouffleSymbol relationName: relationNames){
            SouffleRelation relation = new SouffleRelation(relationName.getName(), relationName.getRange(), true);
            for(SouffleSymbol attribute: attributes){
                SouffleVariable arg = (SouffleVariable) attribute;
                relation.addArg(arg);

                if(firstPass){
                    SouffleContext variableContext = new SouffleContext(SouffleContextType.VARIABLE, new Range(arg.getRange().getStart(), arg.getRange().getEnd()));
                    SouffleContext typeContext = new SouffleContext(SouffleContextType.TYPE, new Range(arg.getType().getRange().getStart(), arg.getType().getRange().getEnd()));
                    variableContext.addContextSymbol(arg);
                    typeContext.addContextSymbol(arg.getType());

                    declarationContext.addToContextScope(attribute);

                    declarationContext.addToSubContext(variableContext);
                    declarationContext.addToSubContext(typeContext);
                    firstPass = false;
                }

            }
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
        currentScope.peek().add(relationName);
        return super.visitRelation_names(ctx);
    }

    @Override
    public SouffleSymbol visitRule_def(SouffleParser.Rule_defContext ctx) {
        SouffleContext ruleContext = new SouffleContext(SouffleContextType.RULE,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        currentContext.push(ruleContext);
        documentContext.addToSubContext(ruleContext);

        currentScope.push(new ArrayList<>());
        ctx.head().accept(this);
        List<SouffleSymbol> rules = currentScope.pop();
        SouffleRule rule = null;
        for(SouffleSymbol symbol: rules){
            SouffleRelation relationSymbol = (SouffleRelation) symbol;
            rule = new SouffleRule(symbol.getName(), symbol.getRange());
            rule.addArgs(relationSymbol.getArgs());
            documentContext.addToContextScope(relationSymbol);
            ruleContext.addContextSymbol(relationSymbol);
        }

        assert rule != null;
        for(SouffleVariable argSymbol : rule.getArgs()){
            SouffleContext variableContext = new SouffleContext(SouffleContextType.VARIABLE, new Range(argSymbol.getRange().getStart(), argSymbol.getRange().getEnd()));
            variableContext.addContextSymbol(argSymbol);
            ruleContext.addToContextScope(argSymbol);
            ruleContext.addToSubContext(variableContext);
        }
        currentContext.pop();

        return null;
    }

    @Override
    public SouffleSymbol visitHead(SouffleParser.HeadContext ctx) {
        SouffleSymbol atom = ctx.atom().accept(this);
        assert currentScope.peek() != null;
        currentScope.peek().add(atom);
        return super.visitHead(ctx);
    }

    @Override
    public SouffleSymbol visitFact(SouffleParser.FactContext ctx) {
        SouffleContext factContext = new SouffleContext(SouffleContextType.RELATION_USE,toRange(ctx));
        assert currentContext.peek() != null;
        SouffleContext documentContext = currentContext.peek();
        documentContext.addToSubContext(factContext);

        SouffleRelation fact = (SouffleRelation) ctx.atom().accept(this);
        factContext.addContextSymbol(fact);
        documentContext.addToContextScope(fact);

        return super.visitFact(ctx);
    }

    @Override
    public SouffleSymbol visitAtom(SouffleParser.AtomContext ctx) {
        SouffleSymbol atomName = ctx.qualified_name().accept(this);
        currentScope.push(new ArrayList<>());
        ctx.arg_list().accept(this);
        List<SouffleSymbol> args = currentScope.pop();
        SouffleRelation atom = new SouffleRelation(atomName.getName(), atomName.getRange());
        for(SouffleSymbol attribute: args){
            SouffleVariable arg = (SouffleVariable) attribute;
            atom.addArg(arg);
        }
        return atom;
    }
    @Override
    public SouffleSymbol visitArg(SouffleParser.ArgContext ctx) {
        SouffleSymbol symbol = new SouffleVariable(ctx.getText(), toRange(ctx));
        super.visitArg(ctx);
        return symbol;
    }

    @Override
    public SouffleSymbol visitNon_empty_arg_list(SouffleParser.Non_empty_arg_listContext ctx) {
        SouffleVariable arg = (SouffleVariable) ctx.arg().accept(this);
        assert currentScope.peek() != null;
        currentScope.peek().add(arg);
        return super.visitNon_empty_arg_list(ctx);
    }

    @Override
    public SouffleSymbol visitNon_empty_attributes(SouffleParser.Non_empty_attributesContext ctx) {
        SouffleVariable attribute = (SouffleVariable) ctx.attribute().accept(this);
        assert currentScope.peek() != null;
        currentScope.peek().add(attribute);
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
