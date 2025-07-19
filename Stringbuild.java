public class Stringbuild {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=((char)('a'+i));
            builder.append(ch);
        }
        // it will print reverse form a to z in output.
        //builder.reverse();
        //System.out.println(builder);
        
        System.out.println(builder.toString());
    }
}
 
// if we want to remove space in given string we can do like this.
// class String{
//     public static void main(String[] args) {
//         String name="hi my name is yashu";
//          System.out.println(name.replaceAll("\\s"," "));
//     }
// }
// output like this -> himynameisyashu

// here how to use split
// String name="yashu is good boy";
// String[]space=name.split(" ");
// System.out.println(Array.toString(space));

//output -> [yashu,is,good,boy]