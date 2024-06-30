package arrays.binarySearch;

import java.io.CharArrayReader;

public class InviniteNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 11,12,13,34,45,56,67,78,78,80,81,84,85,89,91,92,94,95,96,99};
        int target = 91;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end + 1;
            end = start + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]<target)
                start = mid + 1;
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

}
