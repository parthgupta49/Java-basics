package recursion.level1Ques;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        // 1 + 2 + 3 + 4 = 10
        // 4 + sumofDigits(1234)
        System.out.println(sumOfDigits(1234));
    }
    static int sumOfDigits(int n){
        if (n==0){return 0;}
        int rem = n % 10;
        n = n /10;
        return rem + sumOfDigits(n);
    }
}
