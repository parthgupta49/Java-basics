package arrays.linearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{233,4},{34,35,24,42},{34,45,232,113,12,-34}};
//        int target = 12;
//        int[] index = searchIn2DWithReturningIndexes(arr,target);
//        System.out.println(Arrays.toString(index));
//        System.out.println(searchIn2D(arr, target));
//        System.out.println(maximumIn2DArrays(arr));
//        System.out.println(minimumIn2DArrays(arr));
    }
    static boolean searchIn2D(int[][] arr,int target){
        /*
        using ordinary loop...
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target)
                    System.out.println("Element founded");
            }
        }
        */
        for (int[] num : arr) {
            for (int i : num) {
                if (i==target)
                    return true;
            }
        }
        return false;
    }
    static int[] searchIn2DWithReturningIndexes(int[][] arr,int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if (arr[rows][col]==target){
                    return new int[]{rows,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int maximumIn2DArrays(int[][] arr){
        int max = Integer.MIN_VALUE;
        /*
        for (int[] num : arr) {
            for (int i : num) {
                if (i>max)
                    max = i;
            }
        }
        */
//        using traditional looping structure
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        return max;
    }
    static int minimumIn2DArrays(int[][] arr){
        int min = Integer.MAX_VALUE;
        /*
        for (int[] num : arr) {
            for (int i : num) {
                if (i>min)
                    min = i;
            }
        }
        */
//        using traditional looping structure
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<min)
                    min = arr[i][j];
            }
        }
        return min;
    }




}
