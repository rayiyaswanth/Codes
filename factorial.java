import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        //formula.
        //f(n)=n*f(n-1);
        int n = in.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial of "+ n + " is : " + fact);
    
    }
}


