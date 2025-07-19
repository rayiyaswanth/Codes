import java.util.*;
import java.util.ArrayList;

public class Operrators {
   
    public static void main(String[] args) {
        //  + operater only works for primitives .
        // this char a and b are the astra values it will add a value and b
        System.out.println('a'+'b');
        //but strings no convert values
        System.out.println("a" + "b");
        //we can add numbers to char values 3 numbers will added to a value .
        System.out.println('a'+3);
        //if we want to convert numbers in to character like 100 is d
        System.out.println((char)(100));
        //integer will be converted in to integer that  will call tostring() like ->+ " " + .
        //here it will print like a1.
        System.out.println("a"+1);
        //+ operater when we are using for both side it will ask string to print together in output. example
        // if -> " " it not given then gives error.
        String ans=new Integer(56)+ " " +new ArrayList<>();
        System.out.println(ans);

    }
}
