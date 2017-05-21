package com.company.server;

import com.company.server.Server;

import java.io.*;
import java.net.Socket;

/**
 * Created by yu-hsuan on 2017/4/19.
 */
public class ChatServerConnection extends Thread{
    private BufferedReader reader;
    private PrintWriter writer;
    private Server server;

    public ChatServerConnection(Socket socket, Server server) {
        // TODO 1: Initilize
        this.server = server;
        try{
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void run() {
        /** TODO 2: Override the run() method
         *      TODO 2-1: Use a loop to listen to client's message
         *      TODO 2-2: Broadcast the message to all the clients
         */
        while(true){
            try{
                String line = reader.readLine();
                server.broadcast(line);

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        // TODO 3: Use writer to send message to client
        writer.println(message);
        writer.flush();
    }
}
