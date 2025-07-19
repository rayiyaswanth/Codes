public class binarysearch2 {
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,3};
        System.out.println(binarysearch(arr, 8, 0, arr.length-1));
    }
    static int binarysearch(int[]arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return binarysearch(arr,target,s,m-1);
            }else{
                return binarysearch(arr, target, m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return binarysearch(arr, target, m+1, e);
        }else{
            return binarysearch(arr, target, s, m-1);
        }
        
    }
}
