package arrays.Basics;

import java.util.Arrays;

public class ArraysBasicQues {
    public static void main(String[] args) {
        int[] arr = {12,300,4,60,23,433};
//        System.out.println(Arrays.toString(arr));
//        swap(arr,1,4);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(maximum(arr,2,5));
        reverse(arr);
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int maximum(int[] arr,int start , int end){
        int max = arr[start];
        for (int i = (start+1); i <= end; i++) {
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    static void reverse(int[] arr){
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
