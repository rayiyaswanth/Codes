import java.text.DecimalFormat;
import java.util.Scanner;

public class FindSquareRoot {
     public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       double n=40;
       double squar=Math.sqrt(n);
       DecimalFormat df=new DecimalFormat("0.000");
       System.out.println(df.format(squar));
     }
}
