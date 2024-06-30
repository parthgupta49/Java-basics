package CustomArrayList.LearningAgain.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i*i);
        }
        arr.forEach((item)-> System.out.print(item*2+" ")); // one line functions - lambda functions

        Consumer<Integer> list = (item)-> System.out.print(item*2+" ");
        arr.forEach(list);
    }
}
