package recursion;

public class BS {
    public static void main(String[] args) {
    int[] arr = {1,2,4,5,67,77};
    int target = 677;
        System.out.println(binarySearch(0,arr.length-1,arr,target));
    }

    static int binarySearch(int start,int end,int[] arr,int target){
        if(start>end)
            return -1;
        int mid = start + (end-start)/2;
        if (arr[mid]==target)
            return mid;
        if (arr[mid]<target)
            return binarySearch(mid+1,end,arr,target);
        else
            return binarySearch(start,mid-1,arr,target);
    }
}
