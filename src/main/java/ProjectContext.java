import org.eclipse.lsp4j.Range;

import java.util.HashMap;
import java.util.Map;

public class ProjectContext {
    private final Map<String, SouffleContext> documents;
    private Range cursorPosition;

    public ProjectContext() {
        documents = new HashMap<>();
    }

    public SouffleContext getContext(String documentUri, Range range){
        SouffleContext documentContext = documents.get(documentUri);
        SouffleContext current = documentContext.getFromSubContext(range);
        SouffleContext next = current;
        cursorPosition = range;

        if(current == null){
            return documentContext;
        }

        while (next != null){
            current = current.getFromSubContext(range);
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
