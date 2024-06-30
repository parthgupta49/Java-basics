package arrays.leetcodeQuestion;
//
// 1295. Find Numbers with Even Number of Digits
public class EvenNumOfDigits3 {
    public static void main(String[] args) {
        int[] nums = {53529,334413,3348,1377};
        System.out.println(findNumbers(nums));
//        int num = 23;
//        String str = String.valueOf(num);
//        System.out.println(str);
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
//            String temp = String.valueOf(nums[i]);
            if (String.valueOf(nums[i]).length()%2==0)
                count++;
        }
        return count;
    }

   /* private static boolean even(int num) {
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
    }*/


}
