// SumClient.java
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SumClient {
    public static void main(String[] args) {
        final String SERVER_IP = "localhost"; // or use your IP
        final int PORT = 1234;

        try (Socket socket = new Socket(SERVER_IP, PORT)) {
            System.out.println("Connected to server!");

            // Input/Output streams
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Send to server
            dos.writeInt(num1);
            dos.writeInt(num2);

            // Read sum from server
            int result = dis.readInt();
            System.out.println("Sum received from server: " + result);

            // Close connections
            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
