public class CheckArraySortedornot {
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
        //arr={1,4,3,2} -> it gives false . Because it is not sorted array.
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index){
        if(arr[index]==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
