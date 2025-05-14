// SumServer.java
import java.io.*;
import java.net.*;

public class SumServer {
    public static void main(String[] args) {
        final int PORT = 1234;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running and waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input/Output streams
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Receive two integers
            int num1 = dis.readInt();
            int num2 = dis.readInt();

            System.out.println("Received numbers: " + num1 + ", " + num2);

            // Compute sum and send result
            int sum = num1 + num2;
            dos.writeInt(sum);
            System.out.println("Sent sum: " + sum);

            // Close connections
            dis.close();
            dos.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
