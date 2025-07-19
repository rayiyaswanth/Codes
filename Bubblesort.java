import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]arr={-5,0,1,3,4,2};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){
        boolean swapped;
      for(int i=0;i<arr.length;i++){
        swapped =false;
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                 swapped=true;
            }
        }
        if(!swapped){
            break;
          }
      }
      
    }
}
// here how to sort easily.
// int []n={5,4,3,2,1};
//fun(n);
//system.out.print(n);
//}
// static void fun(int[]n){
//     Arrays.sort(n);
//     for(int i=0;i<n.length;i++){
//         System.out.print(n[i]+" ");
//     }
// }
