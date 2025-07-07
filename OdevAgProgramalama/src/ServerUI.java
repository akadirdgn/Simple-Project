import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ServerUI {

    private JFrame frame;
    private JTextArea logArea;
    private JButton startButton;
    private JTextField portField;
    private TCPServer server;

    public ServerUI() {
        frame = new JFrame("TCP Server");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/img/a.jpg")));
        frame.setContentPane(background);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(false);
        topPanel.add(new JLabel("Port:"));
        portField = new JTextField("1234", 5);
        topPanel.add(portField);
        startButton = new JButton("Başlat");
        topPanel.add(startButton);
        frame.add(topPanel, BorderLayout.NORTH);

        logArea = new JTextArea();
        logArea.setEditable(false);
        frame.add(new JScrollPane(logArea), BorderLayout.CENTER);

        startButton.addActionListener((ActionEvent e) -> startServer());

        frame.setVisible(true);
    }

    private void startServer() {
        int port = Integer.parseInt(portField.getText());
        server = new TCPServer(port, this);
        new Thread(server).start();
    }

    public void log(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        logArea.append("[" + sdf.format(new Date()) + "] " + message + "\n");
    }
}
