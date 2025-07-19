import java.util.Arrays;
import java.util.Scanner;

public class ArraysString {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        String[] n=new String[4];
        // it print like this 
        //yashu alone is good
        //[yashu, alone, is, good]
        for(int i=0;i<n.length;i++){
            n[i]=in.next();
        }
        System.out.println(Arrays.toString(n));
    }
}
