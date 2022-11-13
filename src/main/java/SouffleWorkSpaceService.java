import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.ExecuteCommandParams;
import org.eclipse.lsp4j.RenameFilesParams;
import org.eclipse.lsp4j.services.WorkspaceService;
import org.eclipse.xtext.xbase.lib.Pair;

import java.io.IOException;
import java.net.URI;
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
            String path = params.getArguments().get(0).toString().replaceAll("\"", "");
            ProcessBuilder processBuilder = new ProcessBuilder("souffle-lint","lint","--format","json", path);
            Process p;
            try {
                p = processBuilder.start();
                p.waitFor();
                String json = new String(p.getInputStream().readAllBytes());
                json = "[" + json.replaceAll("}\n", "},") + "]";

                Gson gson = (new GsonBuilder()).serializeNulls().create();
                SouffleLint[] souffleLints = gson.fromJson(json, SouffleLint[].class);
                List<SouffleLint> lints = Arrays.asList(souffleLints);
                LSClientLogger.getInstance().reportLints(lints, Path.of(path).toUri().toString());

                System.err.println(lints);

                return null;
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
