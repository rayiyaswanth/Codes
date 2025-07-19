import java.util.Arrays;
import java.util.Scanner;

public class lettersBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = new char[5];  // Array of 5 characters.

        System.out.print("Enter 5 characters in any order: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next().charAt(0);  // Takes single character input
        }

        System.out.print("Enter the target character: ");
        char target = in.next().charAt(0);

        char result = greatestLetter(arr, target);
        System.out.println("Next greatest letter: " + result);
        
        in.close(); // Closing the scanner
    }

    static char greatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // If no element is greater, return the first element (circular behavior)
        return arr[start % arr.length];
    }
}
