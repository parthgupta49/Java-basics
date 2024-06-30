package arrays.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> arr = new ArrayList<>();
        // initialisation
        for (int i = 0; i < 2; i++) {
            arr.add(new ArrayList<>());
        }
//        add elements
        for (int i = 0; i < 2; i++) {
            System.out.println("Row "+(i+1)+" values : ");
            for (int j = 0; j < 2; j++) {
                System.out.println("Col "+(j+1)+" :");
                arr.get(i).add(in.nextInt());
            }
        }
        for(ArrayList<Integer> num : arr){
            System.out.println(num);
        }
    }
}
