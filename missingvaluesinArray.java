import java.util.Arrays;

class missingvaluesinArray{
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {  
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            }else{
                i++;
            }
        }
        for (i = 0; i < arr.length; i++){
            if (arr[i] != i) return i;
        }
        return arr.length;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}