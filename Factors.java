import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(20);
        //here between  1 to 20 numbers . if any numbers divided by 20 
        //print that all the numbers in between 1 to 20 in output.
    }
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
// by using Arraylist here 
//   static void factors(int n){
//     ArrayList<Integer>list=new ArrayList<>();
//     for(int i=1;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             if(n/i==i){
//                 System.out.print(i+" ");
//             }else{
//                 System.out.print(i+" ");
//             }list.add(n/i);
//         }
//     }
//     for(int i=list.size()-1;i>=0;i--){
//         System.out.print(list.get(i)+" ");
//     }
//   }
//   }