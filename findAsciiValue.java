public class findAsciiValue {
    public static void main(String[] args) {
        char ch='a';
        int a=99;
        System.out.println(ch+0);
        //if we need to convert value to char..then.
        System.out.println((char)(a));
        //or print like this.
        System.out.println((char)(ch+0));
        System.out.println((char)(ch+1));
        System.out.println((char)(ch+2));//...etc
    }
}
