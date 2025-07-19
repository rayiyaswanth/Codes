import java.util.Arrays;
import java.util.*;
public class FindsamenumberinArrays2  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n=in.nextInt();
        System.out.print("enter the elements :");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("enter the target : ");
        int target=in.nextInt(); // Example input
        int[] duplicates = findDuplicates(arr,target);
        System.out.println( Arrays.toString(duplicates));
    }
    static int[] findDuplicates(int[] arr,int target) {
    int firstindex=-1;
    int secondindex=-1;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            if(firstindex==-1){
                firstindex=i;
            }else{
                secondindex=i;
                break;
            }
        }
      }
      if(firstindex!=-1 && secondindex!=-1){
         return new int[]{firstindex,secondindex};
      }else{
        return new int[]{-1,-1};
      }
    }
}

// try it once.

    //     int i = 0;
    //     while (i < arr.length) {
    //         int correctIndex = arr[i] - 1; // Expected index for current number
    //         if (arr[i] != arr[correctIndex]) {
    //             swap(arr, i, correctIndex);
    //         } else {
    //             i++;
    //         }
    //     }
    //     // Find all duplicates
    //     int[] temp = new int[arr.length]; // Temporary array to store duplicates
    //     int count = 0;

    //     for (i = 0; i < arr.length; i++) {
    //         if (arr[i] != i + 1) {
    //             temp[count++] = arr[i]; // Store duplicate number
    //         }
    //     }

    //     // Trim the duplicate array to correct size
    //     return Arrays.copyOf(temp, count);
    // }

    // static void swap(int[] arr, int a, int b) {
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;