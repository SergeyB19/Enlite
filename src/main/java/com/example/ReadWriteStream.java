package com.example;

import java.io.*;

public class ReadWriteStream {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);

        out.print("Hello");
        out.print(125);
        out.close();

        int temp;
        while ((temp = in.read()) != -1) {
            System.out.print((char) temp);
        }
        in.close();
    }
}
