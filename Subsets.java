import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        subset(" ","abc");
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
          System.out.println(p);
          return;
        }
        char ch=up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
}

//output like this ->

// abc
// ab
// ac
// a
// bc
// b
// c

// Arraylist also we can do it.
// public static void main(String[] args) {
//     System.out.println(subset(" ","abc"));
// }
// static ArrayList<String> subset(String p,String up){
//     if(up.isEmpty()){
//     ArrayList<String>list=new ArrayList<>();
//     list.add(p);
//     return list;
//     }
//     char ch=up.charAt(0);
//    ArrayList<String> left = subset(p+ch, up.substring(1));
//    ArrayList<String> right = subset(p, up.substring(1));
//     left.addAll(right);
//     return left;
// }
// }
//output like this ->
//[ abc,  ab,  ac,  a,  bc,  b,  c,  ]