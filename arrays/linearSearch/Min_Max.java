package arrays.linearSearch;

public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {13,34,452,2,133,23,24424,42424};
        System.out.println("The maximum element in the array " + findMax(arr));
        System.out.println("The minimum element in the array " + findMin(arr));
    }
    static int findMax(int[] arr){
        if (arr.length==0)
            return -1;
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
