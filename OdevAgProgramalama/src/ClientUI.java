import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ClientUI {

    private JFrame frame;
    private JTextField ipField, portField, messageField;
    private JTextArea chatArea;
    private JButton connectButton, sendButton, disconnectButton;
    private TCPClient client;

    public ClientUI() {
        frame = new JFrame("TCP Client");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/img/a.jpg")));
        frame.setContentPane(background);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(false);
        topPanel.add(new JLabel("Sunucu IP:"));
        ipField = new JTextField("127.0.0.1", 10);
        topPanel.add(ipField);
        topPanel.add(new JLabel("Port:"));
        portField = new JTextField("1234", 5);
        topPanel.add(portField);
        connectButton = new JButton("Bağlan");
        topPanel.add(connectButton);
        disconnectButton = new JButton("Bağlantıyı Kes");
        disconnectButton.setEnabled(false);
        topPanel.add(disconnectButton);
        frame.add(topPanel, BorderLayout.NORTH);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(false);
        messageField = new JTextField(20);
        bottomPanel.add(messageField);
        sendButton = new JButton("Gönder");
        sendButton.setEnabled(false);
        bottomPanel.add(sendButton);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        connectButton.addActionListener(e -> connectToServer());
        sendButton.addActionListener(e -> sendMessage());
        disconnectButton.addActionListener(e -> disconnectFromServer());

        frame.setVisible(true);
    }

    private void connectToServer() {
        String ip = ipField.getText();
        int port = Integer.parseInt(portField.getText());
        client = new TCPClient(ip, port, this);
        new Thread(client).start();
        sendButton.setEnabled(true);
        disconnectButton.setEnabled(true);
    }

    private void sendMessage() {
        if (client != null) {
            client.sendMessage(messageField.getText());
            messageField.setText("");
        }
    }

    private void disconnectFromServer() {
        if (client != null) {
            client.disconnect();
            sendButton.setEnabled(false);
            disconnectButton.setEnabled(false);
        }
    }

    public void log(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        chatArea.append("[" + sdf.format(new Date()) + "] " + message + "\n");
    }
}
