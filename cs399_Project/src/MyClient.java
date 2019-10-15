import java.io.IOException;


public class MyClient {

    public static void main(String[] args) throws IOException {

		String host = "localhost";
		int port = 8080;
		String command = "GET";
		String path = "index.html";

        if ("GET".equals(command)) {
            Client.getMethod(host, port, path);
        } else if ("PUT".equals(command)) {
            Client.putMethod(host, port, path);
        }else{
            System.out.println("Check the HTTP command! It should be either GET or PUT");
            return;
        }
    }
}