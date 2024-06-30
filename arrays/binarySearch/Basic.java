package arrays.binarySearch;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {34,42,42,43,4,5,2,34,24244,243,3,3,43,424,53,67,57};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchAlgo(arr, 43));
    }
    static int binarySearchAlgo(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if (target<arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
