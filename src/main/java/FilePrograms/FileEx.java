package FilePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("out.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String s = in.next();
            System.out.print(s + " ");
        }
        in.close();

      /*  PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Hello");
        printWriter.println("World");
        printWriter.close();*/

    }
}
