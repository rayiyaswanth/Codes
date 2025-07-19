import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=a;
        if(b>max && c>max){
            System.out.println("b is greater tha a");
            System.out.println("c is greater than b");
        }else if(max==b && max==c){
            System.out.println("a,b,c are equal");
        }else{
            System.out.println("invailed number");
        }
    }
}
