import java.util.Arrays;
import java.util.Scanner;

class ArrayTwoDtarget{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        //out put give like this ->
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // if target is 5 then ans =(1,1);
        int [][]arr=new int[3][3];
            for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            arr[i][j]=in.nextInt();
            
            }
        }
        int target=in.nextInt();
            int []ans=min(arr,target);
            System.out.println(target+" found in array :"+"("+ans[0]+" , "+ans[1]+")");
            System.out.println(Arrays.deepToString(arr));
   }
   static int[] min(int[][]arr,int target){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]==target){
            return new int[]{i,j};
        }
        }
    }
    return new int[]{-1,-1};
   }
}