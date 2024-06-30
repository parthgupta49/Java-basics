package firstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        0 1 1 2 3 5 8 13
//        a b
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int sum = a + b;
            a = b ;
            b = sum;
        }
//        System.out.println(b);
    }
}
