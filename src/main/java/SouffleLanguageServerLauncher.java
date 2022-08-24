import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Standard IO Launcher for Souffle Language Server.
 */
public class SouffleLanguageServerLauncher {

   public static void main(String[] args) throws InterruptedException, ExecutionException {
       startServer(System.in, System.out);
   }

   /**
    * Starts the language server given the input and output streams to read and write messages.
    *
    * @param in  input stream.
    * @param out output stream.
    * @throws InterruptedException
    * @throws ExecutionException
    */
   public static void startServer(InputStream in, OutputStream out) throws InterruptedException, ExecutionException {
       SouffleLanguageServer server = new SouffleLanguageServer();
       Launcher<LanguageClient> launcher = Launcher.createLauncher(server, LanguageClient.class, in, out);
       LanguageClient client = launcher.getRemoteProxy();
       server.connect(client);
       Future<?> startListening = launcher.startListening();
       startListening.get();
   }
}
