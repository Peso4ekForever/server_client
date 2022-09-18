package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MainClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 80);
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            System.out.println(inputStream.readUTF());
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
