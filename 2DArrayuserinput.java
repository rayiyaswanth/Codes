import java.util.*;
class Arrayuserinput{
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int[][]arr=new int[3][3];
    System.out.println("enter the 9 numbers ");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=in.nextInt();
        }
    }
    for(int[]num:arr){
        System.out.println(Arrays.toString(num));
    }
   }
}