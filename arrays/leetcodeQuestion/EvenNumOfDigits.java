package arrays.leetcodeQuestion;
//
// 1295. Find Numbers with Even Number of Digits
public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {53529,334413,348,177};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int number = num;
        int count=0;
        int quotient = num ;
        while (quotient!=0){
             num = quotient/10;
             quotient = num;
            count++;
        }
        System.out.println(number + " = " + count);
        return count % 2 == 0;
    }


}
