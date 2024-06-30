package Strings;


public class StringReverse {
    public static void main(String[] args) {
        String name = "Parth Gupta";
        String reverse = reverse(name);
        System.out.println(reverse);
    }
    static String reverse(String str){
        int n = str.length();
        String reverse="";
        for (int i = n-1; i >=0   ; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
