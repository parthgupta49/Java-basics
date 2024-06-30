package functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int number = sc.nextInt();
        if (checkArmstrong(number))
            System.out.println("Yes it is a armstrong number");
        else
            System.out.println("No it is not...");*/

//        print all the 3 digits armstrong number
        for (int i = 100; i < 1000; i++) {
            if (checkArmstrong(i))
                System.out.println(i);
        }

    }

    static boolean checkArmstrong(int number) {
        int sum=0;
        int temp = number;
        while (temp>0){
            int rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp/=10;
        }
        return sum==number;
    }

}
