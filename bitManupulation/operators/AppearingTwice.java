package bitManupulation.operators;

public class AppearingTwice {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        // output : 6
        int ans = 0;int j;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            for (j = 0 ; j < arr.length; j++) {
                if (j==i)
                    continue;
                if (ele==arr[j])
                    break;
            }
            if (j==arr.length)
                ans = ele;
        }
        System.out.println(ans);
    }
}
