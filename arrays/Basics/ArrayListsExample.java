package arrays.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        boolean a = true;int inp;
        while (a){
            System.out.print("Enter integer to add : ");arr.add(in.nextInt());
            System.out.println("press 1 to continue");
            inp = in.nextInt();
            if (inp!=1)
                a = false;
        }
        System.out.println(arr);
    }
}
