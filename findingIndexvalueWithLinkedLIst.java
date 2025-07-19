import java.util.ArrayList;
import java.util.*;
// find the indexvalues given target in array.
class LinearsearchWithLinkedLIst {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        findallindex(arr, 4, 0);
        System.out.println(list); 

        // we can also write like these.

        // ArrayList<Integer>ans=findallindex(arr, 4, 0, new ArrayList<>());
        // System.out.println(ans);

    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void findallindex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr, target, index+1);
    }
}

//we can also write like these.

// static ArrayList<Integer> findallindex(int[] arr,int target,int index, ArrayList<Integer>list){
//     if(index==arr.length){
//         return list;
//     }
//     if(arr[index]==target){
//         list.add(index);
//     }
//     return findallindex(arr, target, index+1,list);
// }
// }
// it gives same output.

//Another way for this.
// public static void main(String[] args) {
//     Scanner in=new Scanner(System.in);
//     int[] arr={1,3,4,6,6,7};
//     System.out.println(findallindex(arr, 6, 0));
  
//   }
//   static ArrayList<Integer> findallindex(int[]arr,int target,int index){
//       ArrayList<Integer>list=new ArrayList<>();
//       if(index==arr.length){
//           return list;
//       }
//       if(arr[index]==target){
//           list.add(index);
//       }
//       ArrayList<Integer>ansbelowcalls=findallindex(arr, target, index+1);
//       list.addAll(ansbelowcalls);
//       return list;
//   }
// }

