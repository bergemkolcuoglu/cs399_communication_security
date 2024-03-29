import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {

    private ServerSocket serverSocket;
    private int port;

    public MultiThreadedServer(int port) {
        this.port = port;
    }

    public void start() throws IOException, InterruptedException {

        serverSocket = new ServerSocket(port);
        System.out.println("Starting the socket server at port:" + port);

        Socket client = null;
        while (true) {
            System.out.println("Waiting for clients...");
            client = serverSocket.accept();
            System.out.println("The following client has connected:" + client.getInetAddress().getCanonicalHostName());
            Thread thread = new Thread(new SocketClientHandler(client));
            thread.start();
        }
    }
}