import java.util.Scanner;

public class Binaryceling {
    //ceiling means smallest num in array is greater than or equal to target.
    //but change the return -1 to 'return start;'.
    //floor means greater num in array ia smallest or equal to target.
    // but floor we need to change 'return end;' at the end of this code.

    // if there is no greater or smaller or equal to target .then it return -1;

   public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.print("enter the elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start);
            if(target<arr[mid]){
             end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                System.out.println("index value");
                return mid;
            }
        }
        return start;
    }
}
