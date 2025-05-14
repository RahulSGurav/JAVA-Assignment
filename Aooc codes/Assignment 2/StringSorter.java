import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "Cherry", "Mango", "Blueberry"};

        // Sorting using compareTo() (Bubble Sort)
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                   
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Strings: " + Arrays.toString(words));
    }
}
