import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer implements Runnable {

    private int port;
    private ServerUI ui;

    public TCPServer(int port, ServerUI ui) {
        this.port = port;
        this.ui = ui;
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ui.log("Sunucu başlatıldı, bağlantılar bekleniyor...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ui.log("Bağlanan istemci: " + clientSocket.getInetAddress());
                new ClientServer(clientSocket, ui).start();
            }
        } catch (IOException ex) {
            ui.log("Hata: " + ex.getMessage());
        }
    }
}
