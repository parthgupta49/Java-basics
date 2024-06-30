package Conditionals;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number ");
        long number = sc.nextLong();
        System.out.println("Type the digit you want to find : ");
        byte digit = sc.nextByte();
        byte count = 0;
        long temp = number;
        while (temp>0){
            long rem = temp%10;
            if (rem==digit)
                count++;
            temp/=10;
        }
        System.out.println("The digit " + digit + " in the number " + number + " occurs for \n" + count + " times");
    }
}
