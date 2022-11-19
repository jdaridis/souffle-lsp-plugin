import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonPrimitive;
import logging.LSClientLogger;
import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.ExecuteCommandParams;
import org.eclipse.lsp4j.RenameFilesParams;
import org.eclipse.lsp4j.services.WorkspaceService;
import parsing.symbols.SouffleProjectContext;
import souffleLint.SouffleLint;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * WorkspaceService implementation for Souffle Datalog.
 */
public class SouffleWorkSpaceService implements WorkspaceService {

    private SouffleLanguageServer languageServer;
    LSClientLogger clientLogger;

    public SouffleWorkSpaceService(SouffleLanguageServer languageServer) {
        this.languageServer = languageServer;
        this.clientLogger = LSClientLogger.getInstance();
    }

    @Override
    public void didChangeConfiguration(DidChangeConfigurationParams didChangeConfigurationParams) {
        this.clientLogger.logMessage("Operation 'workspace/didChangeConfiguration' Ack");
    }

    @Override
    public void didChangeWatchedFiles(DidChangeWatchedFilesParams didChangeWatchedFilesParams) {
        this.clientLogger.logMessage("Operation 'workspace/didChangeWatchedFiles' Ack");
    }

    @Override
    public void didRenameFiles(RenameFilesParams params) {
        this.clientLogger.logMessage("Operation 'workspace/didRenameFiles' Ack");
    }

    @Override
    public CompletableFuture<Object> executeCommand(ExecuteCommandParams params) {
        return CompletableFuture.supplyAsync(() -> {
            String path = "";
            boolean allLints = false;
            switch (params.getCommand()){
                case "souffle-lint":
                    path = params.getArguments().get(0).toString().replaceAll("\"", "");
                    break;
                case "souffle-lint-all":
                    path = SouffleProjectContext.getInstance().getProjectPath() + "/**/*.dl";
                    allLints = true;
                    break;
            }
            ProcessBuilder processBuilder;
            JsonPrimitive jsonPrimitive = (JsonPrimitive) params.getArguments().get(1);
            if(!jsonPrimitive.getAsBoolean()){
                processBuilder = new ProcessBuilder("souffle-lint","lint","--format","json", path);
            } else {
                processBuilder = new ProcessBuilder("souffle-lint","lint","--slow","--format","json", path);
            }
            Process p;
            try {
                p = processBuilder.start();
                p.waitFor();
                String json = new String(p.getInputStream().readAllBytes());
                System.err.println(p.exitValue());
                json = "[" + json.replaceAll("}\n", "},") + "]";

                Gson gson = (new GsonBuilder()).serializeNulls().create();
                SouffleLint[] souffleLints = gson.fromJson(json, SouffleLint[].class);
                List<SouffleLint> lints = Arrays.asList(souffleLints);
                if(!allLints){
                    String uri = Path.of(path).toUri().toString();
                    LSClientLogger.getInstance().clearDiagnostics(uri);
                    LSClientLogger.getInstance().reportLints(lints, uri);
                } else {
                    LSClientLogger.getInstance().reportAllLints(lints);
                }


                return null;
            } catch (Exception e) {
                LSClientLogger.getInstance().showErrorMessage(e.getMessage());
                throw new RuntimeException(e);
            }
        });
    }
}
