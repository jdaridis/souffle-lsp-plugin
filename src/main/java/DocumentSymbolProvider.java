import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.DocumentSymbolParams;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DocumentSymbolProvider {

    public DocumentSymbolProvider() {
    }

    public List<Either<SymbolInformation, DocumentSymbol>> getDocumentSymbols(DocumentSymbolParams params) {
        List<Either<SymbolInformation, DocumentSymbol>> documentSymbols = new ArrayList<Either<SymbolInformation, DocumentSymbol>>();
        SouffleContext context = SouffleProjectContext.getInstance().getDocumentContext(params.getTextDocument().getUri());

        getSymbolsFromScope(documentSymbols, context.getScope().values(), params.getTextDocument().getUri(), false);

        return documentSymbols;
    }

    private List<DocumentSymbol> getSymbolsFromScope(List<Either<SymbolInformation, DocumentSymbol>> documentSymbols, Collection<List<SouffleSymbol>> values, String documentUri, boolean inComponent) {
        List<DocumentSymbol> body = new ArrayList<DocumentSymbol>();
        for (List<SouffleSymbol> symbolList : values) {
            DocumentSymbol top = null;
            SouffleSymbol topSymbol = null;
            List<DocumentSymbol> children = new ArrayList<DocumentSymbol>();
            for (SouffleSymbol symbol : symbolList) {
                switch (symbol.getKind()) {
                    case RELATION_DECL:
                        topSymbol = symbol;
                        top = new DocumentSymbol();
                        top.setDetail(".decl");
                        top.setKind(SymbolKind.Class);
                        top.setName(symbol.toString());
                        top.setRange(symbol.getRange());
                        top.setSelectionRange(symbol.getRange());
                        break;
                    case RELATION_USE:
                        DocumentSymbol use = new DocumentSymbol();
                        if (topSymbol == null || topSymbol.getKind() == SouffleSymbolType.RELATION_USE) {
                            topSymbol = symbol;
                            top = use;
                        }
                        use.setDetail("fact");
                        use.setKind(SymbolKind.Field);
                        if (((SouffleRelation) symbol).getDirective() != null) {
                            use.setKind(SymbolKind.Operator);
                            use.setDetail(((SouffleRelation) symbol).getDirective());
                        }
                        use.setName(symbol.toString());
                        use.setRange(symbol.getRange());
                        use.setSelectionRange(symbol.getRange());
                        children.add(use);
                        break;
                    case RULE:
                        List<DocumentSymbol> ruleChildren = new ArrayList<DocumentSymbol>();
                        DocumentSymbol rule = new DocumentSymbol();
                        if (topSymbol == null || topSymbol.getKind() == SouffleSymbolType.RULE) {
                            topSymbol = symbol;
                            top = rule;
                        }
//                            rule.setDetail("Test symbol");
                        rule.setKind(SymbolKind.Method);
                        rule.setName(symbol.toString());
                        rule.setRange(symbol.getRange());
                        rule.setSelectionRange(symbol.getRange());
                        children.add(rule);

/*                        SouffleRule souffleRule = (SouffleRule) symbol;
                        for (SouffleSymbol ruleBody : souffleRule.getBody()) {
                            DocumentSymbol body = new DocumentSymbol();
//                                body.setDetail("Test symbol");
                            body.setKind(SymbolKind.Property);
                            body.setName(ruleBody.toString());
                            body.setRange(ruleBody.getRange());
                            body.setSelectionRange(ruleBody.getRange());
                            ruleChildren.add(body);
                        }
                        rule.setChildren(ruleChildren);*/

                        break;

                    case COMPONENT_DECL:
                        System.err.println("Document symbols " + symbol);
                        DocumentSymbol component = new DocumentSymbol();
                        if (topSymbol == null || topSymbol.getKind() == SouffleSymbolType.COMPONENT_DECL) {
                            topSymbol = symbol;
                            top = component;
                        }
                        component.setDetail(".comp");
                        component.setKind(SymbolKind.Namespace);
                        component.setName(symbol.toString());
                        component.setRange(symbol.getRange());
                        component.setSelectionRange(symbol.getRange());
                        List<DocumentSymbol> componentBody =
                                getSymbolsFromScope(documentSymbols, ((SouffleComponent)symbol).getScope().values(), documentUri, true);
                        component.setChildren(componentBody);

                        break;
                }
            }
            if (top != null && (topSymbol.getURI() != null && topSymbol.getURI().equals(documentUri))) {
                if (topSymbol.getKind() == SouffleSymbolType.RELATION_DECL) {
                    top.setChildren(children);
                }
                if (!inComponent) {
                    documentSymbols.add(Either.forRight(top));
                }
                body.add(top);
            }
        }
        return body;
    }
}