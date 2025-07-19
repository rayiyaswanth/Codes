import java.util.*;
public class numberofSwaps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int swapcount=noswap(arr);
        System.out.println(swapcount);
    }
    static int noswap(int[]arr){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  swap++;
                }
            }
        }
        return swap;
    }
}
