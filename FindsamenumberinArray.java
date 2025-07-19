
public class  FindsamenumberinArray{
    public static void main(String[] args) {
        int[] arr1 = {1, 1,2,3,4}; // Example case 1
       System.out.println(findDuplicate(arr1));
    }
        
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) { // Ignore correct position
            int correctIndex = arr[i] - 1;
                if (arr[i] == arr[correctIndex]) {
                            return arr[i]; // Found duplicate
                        }
                        swap(arr, i, correctIndex);
                    } else {
                        i++;
                    }
                }
                return -1; // No duplicate found (shouldn't happen in valid input)
            }
        
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
        
  