package arrays.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMinAndMax {
    public static void main(String[] args) {
//        int[] arr = takeInput();
//        System.out.println(Arrays.toString(arr));
        int[] arr = {3334,24,45,57,53,24,355,24,-1};
//        System.out.println(maximumElementInArray(arr));
        System.out.println(minimumElementInArray(arr));
    }

    static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of total number of inputs : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int maximumElementInArray(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i>max)
                max = i;
        }
        return max;
    }
    static int minimumElementInArray(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
