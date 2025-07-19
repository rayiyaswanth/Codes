import java.util.Scanner;
class InStringLetterSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        char target='w';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                System.out.println(target+" is there in String");
                return true;
                
        }
     }
     return false;
    }
}
