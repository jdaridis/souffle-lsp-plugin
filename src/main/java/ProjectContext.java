import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.services.LanguageClient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProjectContext {
    public Map<String, SouffleContext> getDocuments() {
        return documents;
    }

    private final Map<String, SouffleContext> documents;
    public Set<String> defines;
    private Range cursorPosition;

    private boolean isInitialized;

    private static ProjectContext INSTANCE;

    private ProjectContext() {
        documents = new HashMap<>();
        defines = new HashSet<>();
    }

    public static ProjectContext getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProjectContext();
        }
        return INSTANCE;
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
