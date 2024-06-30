package Conditionals;

import java.util.Scanner;

public class MaximumOf3Numbers {
    public static void main(String[] args) {
//        largest of 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = input.nextInt();
        System.out.println("Enter b : ");
        int b = input.nextInt();
        System.out.println("Enter c : ");
        int c = input.nextInt();
        /*int max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;*/
        int maximum = Math.max((Math.max(a,b)),c);
//        System.out.println("The largest of 3 numbers "  + max);
        System.out.println("The largest of 3 numbers "  + maximum);
    }
}
