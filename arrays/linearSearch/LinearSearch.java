package arrays.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,41,45,35,34,524,14};
        int target = 524;
//        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearchInRange(arr, 4, arr.length - 1, target));
    }
    static boolean linearSearch(int[] arr,int item){
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==item)
                return true;
        }
        */
//        using for-each loop
        for (int i : arr) {
            if (i==item)
            {
                System.out.println();
                return true;
            }

        }
        return false;
    }
    static boolean linearSearchInRange(int[] arr,int startIndex,int endIndex,int targetElement){

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i]==targetElement)
                return true;
        }
        return false;
    }
}
