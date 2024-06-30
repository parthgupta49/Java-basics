package recursion.Questions.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        /*int num1 = Integer.parseInt("123");
        int num = 12345;
        String number = String.valueOf(num);
        int len = number.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + (number.charAt(i)-'0');
        }
        System.out.println(sum);*/
//        recursive approach
        System.out.println(sumOfDigits(12345));
    }
    static int sumOfDigits(int num){
        if (num==0) return 0;
        return  num%10+sumOfDigits(num/10);
    }
}
