package bitManupulation.operators;

public class NoOfDigitsInBaseB {
    public static void main(String[] args) {
        int n = 16;
        int base = 16;
        int digit = (int )(Math.log(n)/Math.log(base)) + 1;
        System.out.println(digit);
    }
}
