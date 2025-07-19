import java.util.*;
public class orderwiseandreverse {
   public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
    function1(arr);
    System.out.println();
    function2(arr);
   }
   //reverse
   static void function1(int[]arr){
    System.out.println("Reversed : ");
    for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
    }
   }
   // order wise
   static void function2(int[]arr){
    Arrays.sort(arr);
    System.out.println("Order wise : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
}
