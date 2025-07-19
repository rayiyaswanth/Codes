import java.util.Scanner;

public class linearSearch3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
          arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        boolean found=false;
        for(int n:arr){
          if(n==target){
             found=true;
             break;
          }
        }
        if(found){
            System.out.println("ok found :"+ target);
        }else{
            System.out.println("not found : "+ target);
        }
    }
}
