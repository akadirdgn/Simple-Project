import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientServer extends Thread {

    private Socket socket;
    private ServerUI ui;

    public ClientServer(Socket socket, ServerUI ui) {
        this.socket = socket;
        this.ui = ui;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                ui.log("[" + socket.getInetAddress() + "] " + message);
                out.println(message.toUpperCase());
            }

            socket.close();
            ui.log("İstemci bağlantısı kapandı.");
        } catch (IOException ex) {
            ui.log("Bağlantı hatası: " + ex.getMessage());
        }
    }
}
