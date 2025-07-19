import java.util.Scanner;

public class stringpalindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        if(ispalindrom(name)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean ispalindrom(String name){
        int start=0;
        int end=name.length()-1;
        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){//if we gives output 'madam' it will print yes ,if 'medam' will give then print no.
                return false;
            }
            start++;
            end--;
            }
       return true;
    }
}
