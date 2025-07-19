import java.util.Scanner;

public class findNoOfstepstoreduceittozero {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int ans=numofStepsToSolve(num);
        System.out.println(ans);
    }
    static int numofStepsToSolve(int num){
       return helper(num,0);
    }
    static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2, steps+1);
        }else{
            return helper(num-1,steps+1);
        }
    }
}
