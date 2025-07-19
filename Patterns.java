public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(5);
        pattern6(5);
    }
    static void pattern1(int  n){
        // *
        // **
        // ***
        // ****
        System.out.println("pattern 1");
      for(int row=1;row<=n;row++){
        // for every row ,run the col
        for(int col=1;col<=row;col++){
         // here don't put println just print.
            System.out.print("* ");
        }
        //when one row is printed, we need to add a newline.
        System.out.println();
      }
    }
    static void pattern2(int n){
        System.out.println("pattern 2 ");
        // ****
        // ****
        // ****
        // ****
        for(int row=1;row<=n;row++){
            // for every row ,run the col
            for(int col=1;col<=n;col++){
             // here don't put println just print.
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline.
            System.out.println();
    }
}
static void pattern3(int n){
    System.out.println("pattern 3");
    // ****
    // ***
    // **
    // *
    for(int row=1;row<=n;row++){
        // for every row ,run the col
        for(int col=row;col<=n;col++){
         // here don't put println just print.
            System.out.print("* ");
        }
        //when one row is printed, we need to add a newline.
        System.out.println();
}
}
static void pattern4(int n){
    System.out.println("pattern 4 ");
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    for(int row=1;row<=n;row++){
        // for every row ,run the col
        for(int col=1;col<=row;col++){
         // here don't put println just print.
            System.out.print(col + " ");
        }
        //when one row is printed, we need to add a newline.
        System.out.println();
}
}
static void pattern5(int n){
    System.out.println("pattern 5 ");
        // *
        // **
        // ***
        // ****
        // ****
        // ***
        // **
        // *
    for(int row=1;row<2*n;row++){
        // for every row ,run the col
        int totalcolsinrow =row >n ? 2*n-row:row;
        for(int col=1;col<=totalcolsinrow;col++){
         // here don't put println just print.
            System.out.print("* ");
        }
        //when one row is printed, we need to add a newline.
        System.out.println();
}
}
static void pattern6(int n){
    System.out.println("pattern 6 ");
        //    *
        //   ***
        //  *****
        // *******
        // ******
        //  ****
        //  ***
        //   *
    for(int row=1;row<2*n;row++){
        // for every row ,run the col
        //here if condition shortcut used.
        int totalcolsinrow =row >n ? 2*n-row:row;
        int NoOfSpaces =n-totalcolsinrow;
        for(int s=0;s<=NoOfSpaces;s++){
         // here don't put println just print.
           System.out.print(" ");
        }
        for(int col=0;col<totalcolsinrow;col++){
            System.out.print("* ");
        }
        //when one row is printed, we need to add a newline.
        System.out.println();
}
}
}
