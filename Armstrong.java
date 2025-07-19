import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(armstrong(num));
    }
    static boolean armstrong(int num){
         int n=num;
         int sum=0;
         while(n>0){
            int rem=n%10;
            n/=10;
            sum=sum+rem*rem*rem;
         }
         return sum==num;
    }
}
//if u gives -> out put is 153 
//then is gives us -> true.