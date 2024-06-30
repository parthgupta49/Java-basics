package arrays.leetcodeQuestion;

public class Leetcode_35_searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
//        System.out.println(searchInsert(arr, 0));
//        System.out.println(searchInsertOpposite(arr, 15));
    }
    static int searchInsert(int[] nums,int target){
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start = mid + 1;
            else
                end = mid - 1;
            }
        return start;
        }
    static int searchInsertOpposite(int[] nums,int target){
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start = mid + 1;
            else
                end = mid - 1;
            }
        return end;
        }


}
