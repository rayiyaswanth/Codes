import java.util.Scanner;
import java.util.*;
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        int[]arr={-32,-30,0,2,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int maxindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[maxindex]){
                    maxindex=j;
                }
            }
            swap(arr,i,maxindex);
        }
    }
    static void swap(int[]arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
