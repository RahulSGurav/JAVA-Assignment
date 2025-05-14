// Server
import java.util.*;
import java.net.*;
import java.io.*;

class tcpserver {
    public static void main(String args[]) {
        try {
            // Create a server socket to listen on port 1520
            ServerSocket s1 = new ServerSocket(1520);
            System.out.println("Server is running... Waiting for client.");
            // Wait and accept connection from a client
            Socket s2 = s1.accept();
            System.out.println("Client connected.");

            // Create input and output streams for communication
            InputStream is = s2.getInputStream();
            OutputStream os = s2.getOutputStream();

            // Wrap streams with DataInputStream and DataOutputStream
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);

            Scanner sc = new Scanner(System.in);
            String str;

            do {
                // Receive message from client
                str = dis.readUTF();
                System.out.println("Client says: " + str);

                // Read reply from server user and send back to client
                System.out.print("Reply to client: ");
                str = sc.nextLine();
                dos.writeUTF(str);  // Send reply to client

            } while (!str.equalsIgnoreCase("STOP")); // End on "STOP"

            // Close connections
            s2.close();
            s1.close();
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
