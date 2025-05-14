import java.util.Scanner;
import MathOperations.MathFunction;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any decimal number: ");
        double num = sc.nextDouble();

        // Create object of MathFunctions
        MathFunction mf = new MathFunction();

        // Call methods using the object
        mf.Floor(num);
        mf.Ceil(num);
        mf.Round(num);


    }
}
