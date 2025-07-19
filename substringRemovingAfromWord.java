import java.util.*;
public class substringRemovingAfromWord {
    public static void main(String[] args) {
        skip("","baccah");
        System.out.println(skipret("baccah"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    //or we can give return  type like.
    static String skipret(String up){
        if(up.isEmpty()){
                    
            return " ";
        }
        char ch=up.charAt(0);
            if(ch=='a'){
            return skipret(up.substring(1));
            }else{
            return ch + skipret(up.substring(1));
        }
    }
}
// here skiping apple like
// public static void main(String[] args) {
//     System.out.println(skip("bcaccapple"));
// }
// static String skip(String up){
//     if(up.isEmpty()){
//         return " ";
//     }
//     if(up.startsWith("apple")){
//         return skip(up.substring(7));
//     }else{
//          return  up.charAt(0)+skip(up.substring(1));
//     }
// }
// output is->bcacc

