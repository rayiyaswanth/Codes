import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        arr= merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right=merge(Arrays.copyOfRange(arr, mid, arr.length));
        return mergesort(arr,left,right);
    }
    static int[] mergesort(int[] arr,int[] first,int[] second){
        int[] mix=new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}

//we can also do like this.

// int[] arr={5,4,3,2,1};
// mergeInplace(arr,0,arr.length);
// System.out.println(Arrays.toString(arr));
// }
// public static void mergeInplace(int[] arr,int s,int e){
// if(e-s ==1){
//     return;
// }
// int mid=(s+e)/2;
// mergeInplace(arr, s, mid);
// mergeInplace(arr, mid, e);
// mergesort1(arr,s,mid,e);
// }
// public static void mergesort1(int[] arr,int s,int m,int e){
// int[] mix=new int[e-s];
// int i=s;
// int j=m;
// int k=0;
// while (i<m && j<e) {
//     if(arr[i]<arr[j]){
//         mix[k]=arr[i];
//         i++;
//     }else{
//         mix[k]=arr[j];
//         j++;
//     }
//     k++;     
// }
// while(i<m){
//     mix[k]=arr[i];
//     i++;
//     k++;
// }
// while(j<e){
//     mix[k]=arr[j];
//     j++;
//     k++;
// }
// for(int l=0;l<mix.length;l++){
//     arr[s+l]=mix[l];
// }
// }
// }
