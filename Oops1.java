import java.util.*;
public class Oops1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        clar cal=new clar();
        int ans=cal.add(n,m);
        System.out.println("ans : "+ans);
    }
}
class clar{
    public int add(int n,int m){
        int result=n+m;
        return result;
    }
}
