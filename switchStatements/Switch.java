package switchStatements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        enhanced switch example :
        /*while (true) {
            System.out.print("Enter a fruit : ");
            String input = sc.next();
            switch (input) {
                case "apple" -> System.out.println("Apple a day keeps the doctor away");
                case "mango" -> System.out.println("king of fruits");
                case "grapes" -> System.out.println("small fruits");
                case "orange" -> System.out.println("A sweet fruit");
                default -> System.out.println("please provide a valid fruit");
            }
            System.out.print("Enter 0 in case to go out or give any other number: ");
            int inp = sc.nextInt();
            if (inp==0){break;}
        }*/
        int day = sc.nextInt();
        /*
        enhanced switch :
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Week Day");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Not a valid day");
        }
        */

    }
}
