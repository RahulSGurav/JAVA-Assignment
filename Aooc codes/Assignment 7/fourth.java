import java.io.*;
import java.util.*;

class fourth {
    public static void main(String args[]) {
        int a = 0;
        char c;
        String s;

        try {
            FileInputStream fin = new FileInputStream(args[0]);
            while ((a = fin.read()) != -1) {
                c = (char) a;
                System.out.print("" + c);
            }

            System.out.println("Do you want to append the data(yes or exit)?");
            Scanner sc = new Scanner(System.in);
            s = sc.next();

            if (s.equalsIgnoreCase("Yes")) {
                FileWriter fw = new FileWriter(args[0], true);
                BufferedWriter bw = new BufferedWriter(fw);

                String line;
                while (true) {
                    line = sc.nextLine();
                    if (line.equalsIgnoreCase("exit")) {
                        break;
                    }
                    bw.write(line);
                    bw.newLine();
                }

                bw.close();
            }
        } catch (FileNotFoundException e) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("File didn't exist, new file created. Enter the content");


                FileWriter fw = new FileWriter(args[0], true);
                BufferedWriter bw = new BufferedWriter(fw);
                String l;
                while (true) {
                    l = sc.nextLine();
                    if (l.equalsIgnoreCase("exit")) {
                        break;
                    }
                    bw.write(l);
                    bw.newLine();
                }

                bw.close();
            } catch (IOException f) {
                System.out.println(f);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
