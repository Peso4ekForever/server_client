package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(80)) {
            while (true) {
                Socket socket = serverSocket.accept();
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

                outputStream.writeUTF("Тестовая строка");

                outputStream.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
