package arrays.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {77,34,4,3,2,1,0,-34,-344};
        System.out.println(orderAgnosticBS(arr, 77));

    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start]<arr[end];
        while (start<= end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){return mid;}
            else if (isAscending){
                if (target<arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if (target>arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }


        }
        return -1;
    }
}
