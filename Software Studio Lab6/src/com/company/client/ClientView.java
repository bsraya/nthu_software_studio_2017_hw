package com.company.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yu-hsuan on 2017/4/19.
 */
public class ClientView {
    private JPanel root;
    private JScrollPane scrollPanel;
    private JTextField textField;
    private JButton sendBtn;
    private JTextArea textArea;

    private String address = "127.0.0.1";
    private int port = 8000;
    ChatClient client;

    public ClientView() {

        client = new ChatClient(address, port, this);

        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Send messeage after press Enter
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }


    private void sendMessage() {
        // TODO 1: Get textField text and send it server
        String text = textField.getText();
        client.sendMessage(text);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textField.setText("");
            }
        });

    }

    public void displayMessage(String message) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textArea.append(message + '\n');
            }
        });
    }

    private void welcome(String nickname) {
        client.nickname = nickname;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textArea.append("**[Welcome " + nickname + "]\n");
            }
        });
    }

    public static void main(String[] args) {
        ClientView clientView = new ClientView();
        JFrame frame = new JFrame("ClientView");
        frame.setContentPane(clientView.root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        String nickName = JOptionPane.showInputDialog("Nickname", "Unknown");
        clientView.welcome(nickName);
        frame.setVisible(true);
    }
}
