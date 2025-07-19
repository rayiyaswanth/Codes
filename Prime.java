import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
         if(n%i==0){
          return false;
         }
        }       
         return true;
    }
}
// import java.util.*;
// import java.util.ArrayList;
// public class Practice {
//     public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        if(n<=1){
//         System.out.println("not prime");
//         return;
//     }
//     boolean isprime=true;
//        for(int i=2;i*i<=n;i++){
//         if(n%i==0){
//            isprime= false;
//            break;
        
//         }
//     } 
//     if(isprime){
//         System.out.println("prime");
//     }else{
//         System.out.println("not prime");
//     }
// }
// }
  
