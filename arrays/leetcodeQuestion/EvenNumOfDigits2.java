package arrays.leetcodeQuestion;
//
// 1295. Find Numbers with Even Number of Digits
public class EvenNumOfDigits2 {
    public static void main(String[] args) {
        int[] nums = {53,32,348,177};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int noOfDigits = (int)(Math.log10(nums[i]))+1;
            if(noOfDigits%2==0){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int count = 0;
        while (num>0){
            num/=10;
            count++;
        }
        return count%2==0;
    }
    private static int even2(int num) {
        return (int)(Math.log10(num))+1;
    }


}
