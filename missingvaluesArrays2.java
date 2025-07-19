    import java.util.Arrays;

    public class missingvaluesArrays2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8, 9}; // Example array
        int[] missingNumbers = findMissing(arr);
        System.out.println("Missing Numbers: " + Arrays.toString(missingNumbers));
    }

    static int[] findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Expected index for current number
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find missing numbers and store them in an array
        int[] missing = new int[arr.length]; // Temporary array for missing numbers
        int count = 0; // Counter for missing numbers
        
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missing[count++] = i + 1; // Store missing number
            }
        }

        // Trim the missing array to correct size
        return Arrays.copyOf(missing, count);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


