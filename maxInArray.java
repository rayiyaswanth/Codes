import java.util.Arrays;
import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
        }
        maxrange(arr,0,4);
    }
    static void maxrange(int[]arr,int start,int end){
      int maxval=arr[start];
      for(int i=start;i<=end;i++){
        //if we want min value change here//
        //arr[i]>minval//
        if(arr[i]<maxval){
            maxval=arr[i];
        }
      }
      //s.o.p((" max value is  : "+maxval)//
      System.out.println(" max value is  : "+maxval);
    }
}
