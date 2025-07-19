import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.print("Enter the values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target value :  ");
        int target=in.nextInt();
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int[]arr,int target){
      if(arr.length==0){
        return -1;
      }
      // here first search from starting index till to last index but step by step.
      for(int i=0;i<arr.length;i++){

        //here creating one variable and insert that arr.length in arr[i] like this.
        int element=arr[i];

        //here check whether target is finded or not.
        if(element==target){

          //if target found return the target index value.
            return i;
        }
      }
      // here if target is not found then return 0.
      return 0;
    }
}
