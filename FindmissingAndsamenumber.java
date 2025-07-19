import java.util.*;
public class FindmissingAndsamenumber {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        //Enter size of array: 5
        //Enter 5 elements (numbers between 1 to 5):
        //1 2 2 3 5
        //output : [2, 4]
        int n = in.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (numbers between 1 to " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] result = findMissingAndDuplicate(arr);
        System.out.println(Arrays.toString(result)); // Output format: [Duplicate, Missing]
        
        in.close();
    }

    static int[] findMissingAndDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // Swap only if the number is within range and not in its correct position
            if (arr[i] != arr[correctIndex] && arr[i] >= 1 && arr[i] <= arr.length) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Finding the duplicate and missing number
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return new int[]{arr[i], i + 1}; // [Duplicate, Missing]
            }
        }

        return new int[]{-1, -1}; // If no duplicate/missing found
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
    }
}
