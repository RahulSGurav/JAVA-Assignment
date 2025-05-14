import java.io.*;
import java.util.*;
public class StudentInfo
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter name:");
        String name=sc.nextLine();

        System.out.println("Enter Age:");
        int age=sc.nextInt();

        System.out.println("Enter Weight(kg):");
        float weight=sc.nextFloat();

        System.out.println("Enter Height(cm):");
        float height=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter City:");
        String city=sc.nextLine();

        System.out.println("Enter phone no:");
        String phone=sc.nextLine();

        try
        {
            FileOutputStream fos=new FileOutputStream("student.txt");
            DataOutputStream dos =new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            System.out.println("****Data Saved Successfully****");
        }catch (IOException e)
        {
            System.out.println(e);
        }
        try
        {
            FileInputStream fis=new FileInputStream("student.txt");
            DataInputStream dis =new DataInputStream(fis);

            System.out.println("Reading data form the file:");
            System.out.println("Name:"+dis.readUTF());
            System.out.println("Age:"+dis.readInt());
            System.out.println("Weight:"+dis.readFloat());
            System.out.println("Height:"+dis.readFloat());
            System.out.println("City:"+dis.readUTF());
            System.out.println("phone:"+dis.readUTF());

            dis.close();
            fis.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
