import java.util.Scanner;

class reverseNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //give in output like this 12345 then it gives like this 54321//
        int ans=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
