import java.util.*;
public class findfirstandlastposition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[]arr=new int[7];
        System.out.print("enter the  7 munbers : "); //like this -> 1 2 3 3 4 5 6
        for(int i=0;i<arr.length;i++){                 // output is ->[2,3]
            arr[i]=in.nextInt();
        }
        System.out.print("enter target value : ");
        int target=in.nextInt();
        int[]result=searching(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searching(int[]arr,int target){
        int []ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[]arr,int target,boolean findfirstindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(findfirstindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
