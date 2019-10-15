import java.io.IOException;

class MyServer {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

		int portNumber = 8080;
        try {
            MultiThreadedServer socketServer = new MultiThreadedServer(portNumber);
            socketServer.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
