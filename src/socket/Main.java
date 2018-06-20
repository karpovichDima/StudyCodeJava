package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Socket socket = new Socket()){
            socket.connect(new InetSocketAddress("india.colorado.edu", 13), 5000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
