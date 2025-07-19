import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        // here we can do sum or multiple operaters by putting
        //  n*fact(n-1) ..->5*4*3*2*1=120.
        //  n+fact(n-1);-> it gives 5+4+3+2+1 = output ->15.
        //  n-fact(n-1);...->5-4-3-2-1 ...output -> -5.

        return n*fact(n-1);
    }
}
