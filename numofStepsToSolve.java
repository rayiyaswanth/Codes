public class numofStepsToSolve {
    public static void main(String[] args) {
        int num=14;
        int ans=numberofsteps(num);
        System.out.println(ans);
    }
    static int numberofsteps(int num){
        return helper(num,0);
    }
    static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper( num-1, steps+1);
    }
}
