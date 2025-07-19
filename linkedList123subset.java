import java.util.*;
public class linkedList123subset {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        // System.out.println(subset(arr));
            //or print like this
        List<List<Integer>>ans=subset(arr);
        for(List<Integer> List : ans){
            System.out.println(List);
            //or print like this
            // System.out.println(subset(arr));
        }
    }
    static List<List<Integer>> subset(int[] arr){
      List<List<Integer>> outer=new ArrayList<>();
      outer.add(new ArrayList<>());
      for(int num : arr){
        int n=outer.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
        }
      }
      return outer;
    }
}
