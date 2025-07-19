import java.util.ArrayList;
import java.util.List;

public class missingvalueArraylist{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9}; // Example array
        List<Integer> missingNumbers = findMissing(arr);
        System.out.println( missingNumbers);
    }

    static List<Integer> findMissing(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        int i = arr[0]; // Start from the first element
        
        for (int num : arr) {
            while (i < num) { // Find gaps in sequence
                missingNumbers.add(i);
                i++;
            }
            i++; // Move to next expected number
        }
        
        return missingNumbers;
    }
}


