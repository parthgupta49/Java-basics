package Strings;

import javax.xml.namespace.QName;

public class Questions {
    public static void main(String[] args) {
        /*String str = "abcba ";
        int len = str.length();
        int i = 0;
        for (; i < (len/2); i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)){
                System.out.println("Not a palindrome");break;
            }
        }

        if (i==len/2){
            System.out.println("Yes its a palindrome");
        }*/

//        another approach of solving the same question
        String name = new String("Parth");
        String name1 = "Parth";
        System.out.println(name1==name);
//        System.out.println(name.length());
//        System.out.println(checkStringIsPalindrome(name));



    }
    static boolean checkStringIsPalindrome(String str){
        if (str==null)
            return true;
        int start = 0 ;
        int end = str.length() -1 ;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
