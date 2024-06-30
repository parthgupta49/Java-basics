package arrays.Basics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasics {
    int day;
    int year
            ;
    int month;

//    @Override
//    public String toString() {
//        return day + " " +month +" " + year;
//    }

    public ArraysBasics(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {21,34,54,78,53,2,4};
        // Ways to print the arrays
        // 1st : using a simple for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        2nd : Using a for-each loop
//        for(int i : arr)
//            System.out.print(i+" ");
//        3rd : Using Arrays.tostring
//        System.out.println(Arrays.toString(arr));


        // no of rows are mandatory to write in 2D arrays
        int[][] arr = {{12,23,45},{23,45},{22,544,66,77}};

//        for (int rows = 0; rows < arr.length; rows++) {
////            System.out.println(Arrays.toString(arr[rows]));
//            for (int col = 0; col < arr[rows].length; col++) {
//                System.out.print(arr[rows][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int[] num : arr){
//            System.out.println(Arrays.toString(num));
//        }
//        for (int[] num :arr) {
//            for (int y : num ) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }
        int[] n = {2,33,45,4},n2={23,34,451};
//        for (int num :
//                n2) {
//            System.out.println(num + " ");
//        }
//        System.out.println(n);
//        System.out.println(n2);
//        n=n2;
//        System.out.println(n);
//        System.out.println(Arrays.toString());

//        String a = new String("helloo");
//        a = "hello World";
//        System.out.println(a);
//        a = "PArth gupta";
//        System.out.println(a);
//
//        StringBuffer name = new StringBuffer();
//        name = 'g';

//            byte a = 23;
//            short b = 233;
//
//            a = (byte)(b);
//            b = a;
//        System.out.println(b);
//        System.out.println(a);
//        ArraysBasics obj1 = new ArraysBasics(6,8,2004);
//        ArraysBasics obj2 = new ArraysBasics(21,8,2004);
//        System.out.println("Birthday is on : "+obj1);
//        System.out.println("Birthday is on : "+obj2);


//        ArrayList<Integer> list = new ArrayList<>();
//        int a = 1;
//        while (a==1){
//            System.out.println("Enter register Number : ");
//            list.add(sc.nextInt());
//            System.out.println("If you do not want to add more data\nPress 0");
//            a = sc.nextInt();
//        }
//        System.out.println("You entered the following data : "  +   list);
//        int[] arr = {2,3,45,6,1,233,2332,34444};
//        reverseArray(arr);
//        System.out.println(max(arr));
    }
//    static int max(int[] arr){
//        int max = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]>arr[max]){
//                max = i;
//            }
//        }
//        return arr[max];
//    }
//    static void reverseArray(int[] arr){
//        int start = 0,end = arr.length-1;
//        int temp;
//        while (start<=end){
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
