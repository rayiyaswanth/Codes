
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int target = 9;//sum the two numbers in array[] if target is equal then output gives index value.
        int[] ans = twosum(arr, target);
        System.out.println("Indices of two numbers: " + Arrays.toString(ans));

        in.close(); // Closing scanner to prevent resource leaks
    }

    static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Start j from i+1 to avoid duplicate checks
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if no valid pair is found
    }
}
