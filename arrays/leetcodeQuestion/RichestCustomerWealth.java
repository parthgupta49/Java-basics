package arrays.leetcodeQuestion;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(calculateRichestWealthPerson(arr));

    }
    static int calculateRichestWealthPerson(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            int sum = 0;
            for (int col = 0; col < arr[rows].length; col++) {
                sum+=arr[rows][col];
            }
            if (sum>max)
                max = sum;
        }
        /*
        for (int[] nums : arr) {
            int sum = 0;
            for (int i : nums) {
                sum+=i;
            }
            if (sum>max)
                max = sum;
        }
        */
        return max;
    }
}
