import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 5, n = 3;
        int i = 0, j = 0, k = 0;
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m + n];

        // Input for first sorted array
        System.out.println("Enter the 1st array elements:");
        for (i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Input for second sorted array
        System.out.println("Enter the 2nd array elements:");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();  // ✅ Fixed index
        }

        i = 0;
        j = 0;

        // Merging two sorted arrays
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }


        while (i < m) {
            c[k] = a[i];
            k++;
            i++;
        }


        while (j < n) {
            c[k] = b[j];
            k++;
            j++;
        }


        System.out.println("Merged sorted array is:");
        for (i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
