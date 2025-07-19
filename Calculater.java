import java.io.CharArrayReader;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("enter the operater : ");
            Character op=in.next().trim().charAt(0);
        if(op=='+' || op=='-' || op=='*' || op=='%' ){
            System.out.print("enter the first number : ");
            int a=in.nextInt();
            System.out.print("enter the second number : ");
            int b=in.nextInt();
            if(op=='+'){
                ans=a+b;
            }if(op=='-'){
                ans=a-b;
            }if(op=='*'){
                ans=a*b;
            }if(op=='%'){
                ans=a%b;
            }else if(op=='x' || op =='o'){
                System.out.println("invalied number");
            }else{
                System.out.println("output ");
            }
            System.out.println(a+" "+op+" "+b+" = "+ans);
        }
    }
    }
}
