package com.company.client;

import java.io.*;
import java.net.Socket;

/**
 * Created by jerry on 2017/4/19.
 */
public class ChatClient {
    private BufferedReader reader;
    private PrintWriter writer;
    public String nickname;
    public ClientView clientView;

    public ChatClient(String address,int port,ClientView clientView)
    {
        // TODO 1: Initialize
        try {
            this.clientView = clientView;
            Socket connectionToServer = new Socket(address, port);
            reader = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream()));
            writer = new PrintWriter(new OutputStreamWriter(connectionToServer.getOutputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }

        Thread connection = new Thread(new Runnable() {
            @Override
            public void run() {
                /** TODO 2: Override the run method
                 *      TODO 2-1: use a loop to listen to server's message
                 *      TODO 2-2: display the message on textArea
                 */
                while(true) {
                    try {
                        String line = reader.readLine();
                        //System.out.println(line);
                        displayMessage(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        connection.start();
    }

    public void sendMessage(String message)
    {
        // TODO 4: Send message to server
        writer.println(message);
        writer.flush();
    }
    public void displayMessage(String message)
    {
        clientView.displayMessage(message);
    }

}
