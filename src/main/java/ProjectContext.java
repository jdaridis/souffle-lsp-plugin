import org.eclipse.lsp4j.Range;

import java.util.HashMap;
import java.util.Map;

public class ProjectContext {
    private final Map<String, SouffleContext> documents;
    private Range cursorPosition;

    public ProjectContext() {
        documents = new HashMap<>();
    }

    public SouffleContext getDocumentContext(String documentUri) {
        return documents.get(documentUri);
    }

    public SouffleContext getContext(String documentUri, Range range){
        SouffleContext documentContext = documents.get(documentUri);
        SouffleContext current = documentContext;
        SouffleContext next = current;
        cursorPosition = range;
//        System.err.println(current);

        if(current == null){
            return documentContext;
        }

        while (next != null){
            current = current.getFromSubContext(range);
//            System.err.println(current);
            if(current != null){
                next = current.getFromSubContext(range);
                if(next != null) {
                    next = next.getFromSubContext(range);
                }
            } else {
                break;
            }
        }

        return current;
    }

    public void addDocument(String documentUri, SouffleContext souffleContext){
        documents.put(documentUri, souffleContext);
    }

    public Range getCursorPosition() {
        return cursorPosition;
    }

    public void setCursorPosition(Range cursorPosition) {
        this.cursorPosition = cursorPosition;
    }
}
