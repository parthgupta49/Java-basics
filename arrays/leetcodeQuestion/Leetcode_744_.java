package arrays.leetcodeQuestion;

public class Leetcode_744_ {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};

        System.out.println(searchInsert(letters, 'c'));
//        System.out.println(searchInsertOpposite(arr, 15));
    }
    static char searchInsert(char[] letters,char target){
        int start = 0,end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]==target)
                return letters[mid+1];
            else if(letters[mid]<target)
                start = mid + 1;
            else
                end = mid - 1;
            }
        return letters[start];
        }


}
