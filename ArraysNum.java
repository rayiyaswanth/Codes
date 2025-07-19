import java.util.Arrays;
import java.util.Scanner;

public class ArraysNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]n=new int[5];
        for(int i=0;i<n.length;i++){
            n[i]=in.nextInt();
        }
        change(n);
        System.out.println(Arrays.toString(n));
    }
    static void change(int[]n){
        n[1]=2;
    }
}
