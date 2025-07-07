import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class TCPClient implements Runnable {

    private String ip;
    private int port;
    private ClientUI ui;
    private Socket socket;
    private PrintWriter out;

    public TCPClient(String ip, int port, ClientUI ui) {
        this.ip = ip;
        this.port = port;
        this.ui = ui;
    }

    @Override
    public void run() {
        try {
            socket = new Socket(ip, port);
            ui.log("Sunucuya bağlanıldı.");
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String response;
            while ((response = in.readLine()) != null) {
                ui.log("Sunucudan: " + response);
            }

        } catch (IOException ex) {
            ui.log("Bağlantı hatası: " + ex.getMessage());
        }
    }

    public void sendMessage(String message) {
        if (out != null) {
            out.println(message);
            ui.log("Gönderildi: " + message);
        }
    }

    public void disconnect() {
        try {
            if (socket != null) {
                socket.close();
            }
            ui.log("Bağlantı kesildi.");
        } catch (IOException e) {
            ui.log("Bağlantıyı keserken hata: " + e.getMessage());
        }
    }
}
