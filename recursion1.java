import java.util.Scanner;

public class recursion1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        message();
    }
    static void message(){
        for(int i=0;i<=5;i++){
        System.out.println(i+" "+"hello world");
          message1();
        }
    }
    static void message1(){
        System.out.println("program over !");
        message2();
    }
    static void message2(){
        System.out.println("next programe !");
        System.out.println();
    }
}
