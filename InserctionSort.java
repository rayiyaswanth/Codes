import java.util.Arrays;
import java.util.Scanner;

class practiceCode{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr={-2,-3,0,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }else{
                break;
            }
          }
        }
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

