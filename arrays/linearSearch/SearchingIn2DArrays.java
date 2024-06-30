package arrays.linearSearch;

import java.util.Arrays;

public class SearchingIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{23,2323,433,43},{34,2,234,4},{234,4343,-6578,5}};
//        int[] ans = searchIn2DArrays(arr,2323);
//        System.out.println(Arrays.toString(ans));
        System.out.println(minIn2DArrays(arr));
    }
    static int[] searchIn2DArrays(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target)
                    return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static int minIn2DArrays(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min)
                    min = anInt;
            }
        }
        return min;
    }
}
