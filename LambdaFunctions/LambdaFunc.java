package LambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i+1);
        }
        System.out.println(list);
        list.forEach((item)->System.out.print(item*2 + " "));

    }
}
