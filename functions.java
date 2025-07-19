import java.util.*;
public class functions {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int num2=in.nextInt();
        int ans=num+num2;
        System.out.println("Answer is : "+ans);
    }
}
