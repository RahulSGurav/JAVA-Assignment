import java.io.*;
import java.util.*;
public class Vowels
{
    public static void main(String args[])
    {
        int a,vowelcount=0,acount=0;
        char c;
        a=0;
        try
        {
            FileInputStream fin =new FileInputStream("read.txt");
            while((a= fin.read())!=-1)
            {
                c=(char)a;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelcount++;
                }
                if (c == 'a') {
                    acount++;
                }
            }

            File file=new File("read.txt");
            Scanner sc=new Scanner(file);
            int wordcount=0;

            while(sc.hasNext())
            {
                sc.next();
                wordcount++;
            }


            System.out.println("Number of vowels: " + vowelcount);
            System.out.println("Number of 'a': " + acount);
            System.out.println("Total number of words: " + wordcount);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
