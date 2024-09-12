package com.example.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        while (true) {
            Socket sock = serverSocket.accept();
            Thread t = new Thread(new ClientHandler(sock));
            t.start();
        }
    }
}

class ClientHandler implements Runnable {
    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner send = new Scanner(System.in);
            while (in.hasNext()) {
                System.out.println("Data is ome from client: ");
                System.out.println(in.nextLine());
                System.out.println("Please write what you want to sent to client");
                String s = send.nextLine();
                out.println(s);
                out.flush();
            }
        } catch (Exception e) {

        }
    }
}
