package read_file;

import java.io.*;
import java.util.Scanner;

public class ReadingFile {

    private static String separator = File.separator;
    private static final String pathDesktop = separator + "Users" + separator + "DeKar" + separator + "Desktop" + separator + "myFile.txt";
    private static final String pathProject = separator + "Users" + separator + "DeKar" + separator + "Desktop" + separator + "StudyCodeExample" + separator + "src" + separator + "read_file" + separator + "ReadingFile.java";

    public static void main(String[] args) {
        readFile();
        createDoc();
    }

    private static void createDoc() {
        //File file = new File("myFile.txt");
        File file = new File(pathDesktop);

        if(!file.exists()){
            try {
                file.createNewFile();
                // File was created, but it is empty
                // Write message to file
                PrintWriter pw = new PrintWriter(file);
                pw.println("Message from my code");
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("File didn't create. Exception");
            }
        }

    }

    private static void readFile() {
        File file = new File(pathProject);

        Scanner scanner;
        {
          try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
              System.out.println(scanner.nextLine());
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
          }
        }
    }

}
