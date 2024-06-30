package Conditionals;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if (n==a)
            System.out.println(a);
        else if (n==b) {
            System.out.println(b);
        }
        else {
            while (count<=n){
                int fibonacci = a + b;
                a = b ;
                b = fibonacci;
                count++;
            }
            System.out.println(b);
        }
    }
}
