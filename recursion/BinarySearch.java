package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int result = binarySearch(arr, 1, 0, arr.length - 1);
        System.out.println(result);
    }
    static int binarySearch(int[] arr,int target,int start, int end){
        if (start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (arr[mid]==target)
            return mid;
        else if (arr[mid] < target) {
            return binarySearch(arr,target,mid+1,end);
        }
        else
            return binarySearch(arr,target,start,mid-1);
    }


}
// in this problem mid is important only for this particular call
// it does not make sense to carry the mid that is why put it inside the function only
// however to actually break the array into 2 sub-half start and end are so crucial so it is required to carry it forward in the argument of the
// function only


