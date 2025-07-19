public class reversenum2 {
    public static void main(String[] args) {
        rev(1824);
    }
    static void rev(int n){
        int sum=0;
        while(n>0){
        int rem=n%10;
        n/=10;
        sum=sum*10+rem;
        }
        System.out.println(sum);
    }
}
