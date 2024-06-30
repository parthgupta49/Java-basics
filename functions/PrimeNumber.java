package functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (checkPrime(number))
            System.out.println("Yes it is a prime number");
        else
            System.out.println("No it is not a prime number");
    }

    static boolean checkPrime(int number) {
        int count = 0;
        if (number!=2 && number % 2 == 0 || number<=1)
            return false;
        else {
            int sqRoot = (int)Math.sqrt(number);
            for (int i = 3; i < sqRoot; i++) {
                System.out.println(count++);

                if (number % i == 0)
                    return false;
            }

        }
        return true;
    }
}