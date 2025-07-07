import javax.swing.SwingUtilities;


public class MainServer {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ServerUI::new);
    }
}
