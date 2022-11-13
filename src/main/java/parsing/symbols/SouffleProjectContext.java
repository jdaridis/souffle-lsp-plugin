package parsing.symbols;

import org.eclipse.lsp4j.Range;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SouffleProjectContext {
    public Map<String, SouffleContext> getDocuments() {
        return documents;
    }

    private final Map<String, SouffleContext> documents;

    private String projectPath;
    public Set<String> defines;
    private Range cursorPosition;

    private String changedText;

    public String getChangedText() {
        return changedText;
    }

    public void setChangedText(String changedText) {
        this.changedText = changedText;
    }

    private boolean isInitialized;

    private static SouffleProjectContext INSTANCE;

    private SouffleProjectContext() {
        documents = new HashMap<>();
        defines = new HashSet<>();
    }

    public static SouffleProjectContext getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SouffleProjectContext();
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

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public Range getCursorPosition() {
        return cursorPosition;
    }

    public void setCursorPosition(Range cursorPosition) {
        this.cursorPosition = cursorPosition;
    }
}
