package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        check if the given String is palindrome or not
        String str = sc.next();
        if (checkIfPalindrome(str))
            System.out.println("Yes the given string is palindrome");
        else
            System.out.println("No it is not a palindrome");

    }
    private static boolean checkIfPalindrome(String str) {
        if ( str==null || str.length()==0)
            return true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }}
    /*
    private static boolean checkIfPalindrome(String str) {
        int start = 0,end = str.length()-1;
        while (start<=end){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
*/