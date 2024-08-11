package FilePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileEx {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("out.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Hello");
        printWriter.println("World");
        printWriter.close();

    }
}
