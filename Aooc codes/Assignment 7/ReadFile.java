import java.io.*;

public class ReadFile
{
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("../sample.txt");
            int a;
            char ch;
            while((a=fin.read())!=-1)
            {
                System.out.println((char)a);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
