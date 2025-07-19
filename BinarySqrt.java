import java.util.Scanner;
import java.util.*;
public class BinarySqrt {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
       int n=40;
       int dec=3;
       System.out.printf("%3f",sqrt(n,dec));
    }
    static double sqrt(int n,int dec){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }if(m*m>n){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<dec;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
