import java.util.*;
class FindMinorMaxInArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min value : "+min);
        System.out.println("Max value : "+max);
    }
}
