import java.util.Scanner;

public class prime1toNthnumber {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
    for(int num=2;num<40;num++){
        if(isprime(num)){
            System.out.print(num+" ");
        }
    }
}
static boolean isprime(int n){
    if(n<=1)return false;
    for(int i=2;i*i<=n;i++){
        if(n%i==0)return false;
    }
    return true;
    }
}
