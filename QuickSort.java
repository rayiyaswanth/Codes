import java.sql.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        //also use Arrays.sort(nums);
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums,int low,int hi){
        if(low >= hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            //also a reason why if it's already sorted it will swap.
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //now my pivot is at correct index , please sort two half's now.
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}
