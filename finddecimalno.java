import java.util.*;
import java.text.DecimalFormat;
public class finddecimalno {
    public static void main(String[] args) {
       double num=40;
       double square=Math.sqrt(num);
       DecimalFormat df=new DecimalFormat("0.000");
       System.out.println(df.format(square));
    }
}
