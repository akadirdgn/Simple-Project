import javax.swing.SwingUtilities;


public class MainClient {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientUI::new);
    }
}
