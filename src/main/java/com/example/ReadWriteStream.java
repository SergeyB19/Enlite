package com.example;

import java.io.*;

public class ReadWriteStream {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));



//        out.writeUTF("Privet");
        out.writeUTF("Hi");
//        out.write(123);
        out.writeInt(670);
        out.close();

        System.out.println(in.readUTF());
//        System.out.println(in.read());
        System.out.println(in.readInt());
        in.close();

       /* PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);

        out.print("Hello");
        out.print(125);
        out.close();

        int temp;
        while ((temp = in.read()) != -1) {
            System.out.print((char) temp);
        }
        in.close();*/
    }
}
