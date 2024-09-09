package com.example.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        Scanner send = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter something to send to server:");
            String words = send.nextLine();
            out.println(words);
            out.flush();
            out.println("Hello");
            out.println("World");
            out.println("How are you?");
            String s = in.nextLine();
            System.out.println("Data from server has come " + s);
        }

//        out.close();
//        socket.close();
    }
}
