package usingList;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
*/
public class FuzzBizz {
    public static void main(String[] args) {

    }
        public List<String> fizzBuzz(int n) {
            //        the loop will run n-1 times appending the list with n items
            String[] arr= new String[n];

            for (int i = 1; i <= n; i++) {
                if (i%15==0)
                    arr[i-1] = "FizzBuzz";
                else if (i%3==0)
                    arr[i-1] = "Fizz";
                else if (i % 5==0) {
                    arr[i-1] = "Buzz";
                }
                else
                    arr[i-1] = i + "";
            }
            return new ArrayList<>(List.of(arr));

        }
    }

