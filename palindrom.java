import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int original=num;
    int result=0;
    while(num>0){
        int rem=num%10;
        num/=10;
        result=result*10+rem;
    }   
    if(original==result){
        System.out.println("palindrom");
    } else{
        System.out.println("not a palindrom");
    }
    }
}

 