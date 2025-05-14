//client
import java.util.*;
import java.net.*;
import java.io.*;

class tcpclient {
    public static void main(String args[]) {
        try {
            // Create a socket to connect to the server (localhost, port 1520)
            Socket s1 = new Socket("127.0.0.1", 1520);

            // Declare input and output streams for communication
            InputStream is = s1.getInputStream();
            OutputStream os = s1.getOutputStream();

            // Wrap streams to read/write primitive data types
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);

            // Scanner to read input from user
            Scanner sc = new Scanner(System.in);
            String str;
            do {
                // Take input from user and send to server
                System.out.print("Enter message to send: ");
                str = sc.nextLine();
                dos.writeUTF(str);  // Send string to server

                // Receive and print response from server
                System.out.println("Waiting for server response..");
                str = dis.readUTF();
                System.out.println("Server replied: " + str);

            } while (!str.equalsIgnoreCase("STOP"));
// Terminate if "STOP"

            s1.close(); // Close socket connection
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
