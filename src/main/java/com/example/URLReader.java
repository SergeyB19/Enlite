package com.example;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://stackoverflow.com");
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);

        }
        input.close();

    }
}
