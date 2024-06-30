package arrays.binarySearch;

import java.util.Arrays;

public class Basic2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10,11,13};
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchAlgo(arr, 9));
    }
    static int binarySearchAlgo(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
           int mid = (start+end)/2;
            if (target<arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
}
