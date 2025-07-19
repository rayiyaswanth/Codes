import java.util.*;
class reverseString {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
    String name=in.nextLine();                                     
    String name1=in.nextLine();
    System.out.println(new StringBuilder(name).reverse());
    System.out.print(new StringBuilder(name1).reverse());
//                   for this output -> yashu is good
//                      Reversed words: dood si uhsay
//                          output -> yashu
//                            Reverse: uhsay
    }
} 
//         (or)
//  Scanner in = new Scanner(System.in);
//       String name=in.nextLine();
//       String rev=" ";
//       for(int i=name.length()-1;i>=0;i--){
//         rev+=name.charAt(i);
//       }
//       System.out.println(rev);

//      same output-> for this output -> yashu is good
//                      Reversed words: dood si uhsay
//                          output -> yashu
//                            Reverse: uhsay
 
//      (or)

// Scanner in = new Scanner(System.in);

//         // Reversing words in a sentence
//         String name = in.nextLine();
//         String[] words = name.trim().split(" ");
//         System.out.print("Reversed words: ");
//         for (int i = words.length - 1; i >= 0; i--) {
//             System.out.print(words[i] + " ");
//         }
//         System.out.println();

//         // Reversing characters in a string
//         String name1 = in.nextLine();
//         System.out.println("Reverse: " + new StringBuilder(name1).reverse());

//     output -> yashu is good
//     Reversed words: good is yashu 
//      output -> yashu
//     Reverse: uhsay

//             (or)
//  Scanner in = new Scanner(System.in);
//       String n=in.nextLine();
//       String[]word=n.trim().split(" ");
//       String rev=" ";
//       for (int i = n.length()-1; i >=0; i--) {
//          rev+=n.charAt(i);
//         }
//         System.out.println(rev);
//         for (int i = word.length-1; i >=0;  i--) {
//             System.out.print(word[i]+" ");         
//         }
 
//                                         yashu is good -> user input
//            for this code output ->      doog si uhsay
//                                         good is yashu 