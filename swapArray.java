import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // give 5 numbers like 1 2 3 4 5 then it print like 1 4 3 2 5. here index values will swap .
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        // here index will swaped.
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int start,int end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
    }
}
