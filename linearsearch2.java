import java.util.ArrayList;

class Linearsearch2 {
    public static void main(String[]args){
      int[] arr={2,3,1,4,4,5};
      System.out.println(find(arr, 4, 0));
      System.out.println(findIndex(arr, 4, 0));
      System.out.println(findindexlast(arr, 4, arr.length-1));
    }
    static boolean find(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    static int findindexlast(int[]arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return  findindexlast(arr, target, index-1);
    }
}
