import java.util.*;

public class alph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[10];
        System.out.println("Enter 10 Words: ");
        for (int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp;
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
