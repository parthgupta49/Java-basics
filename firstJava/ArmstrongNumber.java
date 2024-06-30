package firstJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        we gotta find all the 3 digit armstrong number
        // say 141 is an armstrong number so the thing we need to do here is we need to take the individual digits from the given number like,
//        1^3 + 4^3 + 1^1 = 141....this is the thing we have to do..
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (checkIfArmstrong(i))
                list.add(i);
        }
        System.out.println(list);


    }
    static boolean checkIfArmstrong(int num){
        int temp = num,sum=0;
        while (temp>0){
            int rem = temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
        }
        return sum==num;
    }
}
