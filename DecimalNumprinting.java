import java.text.DecimalFormat;

public class DecimalNumprinting {
    public static void main(String[] args) {
        float a=123.3424f;
        //printf -> formating type.
        // Here % means place holder
        //2 means upto decimalnumber after point.
        // f means float.
        System.out.printf("%.3f",a);
        System.out.println();
        String b="yashu";
        String c="cool";
        //in string ue use %s -> s means string if we use many times it take strings and replace in to it like .
        //we can use many %s %s here. it will take first string for first %s second for second.
        System.out.printf("Hello my name is %s and i am %s",b,c);
        //or we can also give b and c in printf only like System.out.printf("Hello my name is %s and i am %s","yashu","cool");
        
    }
}
// In decimalformat we can write like this also
//   DecimalFormat df=new DecimalFormat("00.0000");
//   System.out.println(df.format("7.29"));

  //output -> 07.2900


//place holders list

//%c -> characters
//%d -> Decimal num(base 10)
//%e -> Exponential floatinig - point nums
//%f -> Floating - point nums
//%i -> Integers (based 10)
//%s -> Strings
//%t -> Date/time
//%n -> newline.

