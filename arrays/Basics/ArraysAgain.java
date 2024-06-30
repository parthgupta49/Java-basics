package arrays.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = {23,32,43,2,3};
//        String[] str = new String[5];
////        System.out.println(arr + "\n " + str);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
        System.out.print("Enter number of students : ");
        int rows = in.nextInt();
        int[][] arr = new int[rows][];
//        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                System.out.print(arr[i][j]+" ");
//            System.out.println(Arrays.toString(arr[i]));
//            }
//            System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number of subjects for "+(i+1));
            int col = in.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Subject "+(j+1)+" : ");
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
        }
    }

