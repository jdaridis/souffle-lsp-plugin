import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import parsing.symbols.SouffleContext;
import parsing.symbols.SouffleProjectContext;
import parsing.symbols.SouffleSymbol;
import parsing.symbols.SouffleSymbolType;

import java.net.URI;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CodeActionProvider {
    public CodeActionProvider() {
    }

    public List<Either<Command, CodeAction>> getCodeAction(CodeActionParams params) {
        List<Either<Command, CodeAction>> actions = new ArrayList<Either<Command, CodeAction>>();

        lintCodeAction(params, actions);

        Range cursor = params.getRange();
        SouffleContext context = SouffleProjectContext.getInstance().getContext(params.getTextDocument().getUri(), cursor);
        if (context != null) {
            SouffleSymbol currentSymbol = context.getSymbol(cursor);
            if (currentSymbol != null) {
                switch (currentSymbol.getKind()) {
                    case RELATION_USE:
                    case RELATION_DECL:
                        generateIOCodeAction(params, actions, context, currentSymbol);
                        break;
                    case TYPE_USE:
                    case TYPE_DECL:
                        extractTypeCodeAction(params, actions, currentSymbol);
                        break;
                }
            }
        }

        return actions;
    }

    private void extractTypeCodeAction(CodeActionParams params, List<Either<Command, CodeAction>> actions, SouffleSymbol currentSymbol) {
        CodeAction extractSubtypeAction = new CodeAction("Extract as Supertype");
        extractSubtypeAction.setKind(CodeActionKind.RefactorExtract);
        actions.add(Either.forRight(extractSubtypeAction));
        WorkspaceEdit extractEdit = new WorkspaceEdit();
        TextEdit newTypeText = new TextEdit();
        newTypeText.setNewText(".type " + "subType <: " + currentSymbol + "\n\n");

        int line = currentSymbol.getRange().getStart().getLine() + 1;

        List<TextEdit> subtypeEdits = new ArrayList<TextEdit>();
        if (currentSymbol.getKind() != SouffleSymbolType.TYPE_DECL) {
            TextEdit replaceTypeEdit = new TextEdit();
            replaceTypeEdit.setNewText("subType");
            replaceTypeEdit.setRange(currentSymbol.getRange());
            subtypeEdits.add(replaceTypeEdit);
            line = currentSymbol.getRange().getStart().getLine() - 1;
        }
        extractSubtypeAction.setData("subType");
        Position start = new Position(line, 0);

        Range newTypeRange = new Range(start, start);
        newTypeText.setRange(newTypeRange);

        subtypeEdits.add(newTypeText);
        extractEdit.setChanges(Map.of(params.getTextDocument().getUri(), subtypeEdits));
        extractSubtypeAction.setEdit(extractEdit);

        CodeAction extractTypeAction = new CodeAction("Extract Type");
        extractTypeAction.setKind(CodeActionKind.RefactorExtract);
        actions.add(Either.forRight(extractTypeAction));
        WorkspaceEdit extractTypeEdit = new WorkspaceEdit();
        TextEdit newTypeText1 = new TextEdit();
        newTypeText1.setNewText(".type " + "extractedType = " + currentSymbol + "\n\n");

        newTypeText1.setRange(newTypeRange);
        List<TextEdit> extractEdits = new ArrayList<TextEdit>();
        extractEdits.add(newTypeText1);
        if (currentSymbol.getKind() != SouffleSymbolType.TYPE_DECL) {
            TextEdit replaceTypeEdit1 = new TextEdit();
            replaceTypeEdit1.setNewText("extractedType");
            replaceTypeEdit1.setRange(currentSymbol.getRange());
            extractEdits.add(replaceTypeEdit1);
        }
        extractTypeEdit.setChanges(Map.of(params.getTextDocument().getUri(), extractEdits));
        extractTypeAction.setEdit(extractTypeEdit);
    }

    private void generateIOCodeAction(CodeActionParams params, List<Either<Command, CodeAction>> actions, SouffleContext context, SouffleSymbol currentSymbol) {
        CodeAction inputAction = new CodeAction("Generate .input for relation " + currentSymbol.getName());
        inputAction.setKind(CodeActionKind.Refactor);
        actions.add(Either.forRight(inputAction));
        WorkspaceEdit edit = new WorkspaceEdit();
        TextEdit textEdit = new TextEdit();
        textEdit.setNewText("\t.input " + currentSymbol.getName() + "()\n");

        Position end;
        if (currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL) {
            end = currentSymbol.getRange().getEnd();
        } else {
            end = context.getRange().getEnd();
        }
        Position position = new Position(end.getLine() + 2, 0);
        Range newRange = new Range(position, position);
        textEdit.setRange(newRange);
        edit.setChanges(Map.of(params.getTextDocument().getUri(), List.of(textEdit)));
        inputAction.setEdit(edit);

        CodeAction outputAction = new CodeAction("Generate .output for relation " + currentSymbol.getName());
        outputAction.setKind(CodeActionKind.Refactor);
        actions.add(Either.forRight(outputAction));
        WorkspaceEdit edit1 = new WorkspaceEdit();
        TextEdit textEdit1 = new TextEdit();
        textEdit1.setNewText("\t.output " + currentSymbol.getName() + "()\n");

        textEdit1.setRange(newRange);
        edit1.setChanges(Map.of(params.getTextDocument().getUri(), List.of(textEdit1)));
        outputAction.setEdit(edit1);

        if ((currentSymbol.getKind() == SouffleSymbolType.RELATION_DECL ||
                currentSymbol.getKind() == SouffleSymbolType.COMPONENT_DECL) &&
                currentSymbol.getPotentialDocumentation().getKey() != null) {
            CodeAction formatComments = new CodeAction("Format documentation with /* */");
            formatComments.setKind(CodeActionKind.RefactorRewrite);
            WorkspaceEdit commentEdit = new WorkspaceEdit();
            TextEdit commentTextEdit = new TextEdit();
            commentTextEdit.setRange(currentSymbol.getPotentialDocumentation().getValue());
            commentTextEdit.setNewText(currentSymbol.getPotentialDocumentation().getKey());
            commentEdit.setChanges(Map.of(params.getTextDocument().getUri(), List.of(commentTextEdit)));
            formatComments.setEdit(commentEdit);
            actions.add(Either.forRight(formatComments));
        }
    }

    private void lintCodeAction(CodeActionParams params, List<Either<Command, CodeAction>> actions) {
        CodeAction codeAction = new CodeAction("Lint with souffle-lint");
        Command command = new Command();
        command.setCommand("souffle-lint");
        Path path = Path.of(URI.create(params.getTextDocument().getUri()));
        command.setArguments(List.of(path.toString()));
        codeAction.setCommand(command);
        codeAction.setKind(CodeActionKind.Source + ".lint");
        actions.add(Either.forRight(codeAction));
    }
}