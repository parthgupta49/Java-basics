package Conditionals;

import java.util.Scanner;

public class CaseChecking {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().trim().charAt(0);
//        if (c>='A' && c<='Z')
//            System.out.println("Uppercase");
//        else
//            System.out.println("Lowercase");
        int a = 12;
        int b = 24;
        if(a==12 && ++b==25  ){
            System.out.println("here a is 12 and b is equal to 12");
        }
        System.out.println(b);
    }
}
