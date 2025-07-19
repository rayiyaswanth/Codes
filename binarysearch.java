import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.print("enter the elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        sorted(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("enter the target value : ");
        int target=in.nextInt();
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static void sorted(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
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
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start);
            if(target<arr[mid]){
             end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                System.out.println("index value");
                return mid;
            }
        }
        return -1;
    }
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    public void populate(Object scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'populate'");
    }
}
