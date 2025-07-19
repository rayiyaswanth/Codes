public class countAnyDoubleNumber {
    public static void main(String[] args) {
        int num=1204030;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==0){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
