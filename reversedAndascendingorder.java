import java.util.Arrays;

public class reversedAndascendingorder {
    public static void main(String[] args) {
        int[]arr={25,0,24,1,23,5,2};
        fun1(arr);
        System.out.println();
        fun(arr);
    }
    // ascending order code.
    static void fun(int[]arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //reverse code.
    static void fun1(int[]arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
