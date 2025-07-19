import java.util.*;
public class RemoveELements {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int val=in.nextInt();
        int ans=removelement(arr,val);
        System.out.println(Arrays.toString(ans));
    }
    static int removelement(int[]arr,int val){
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
