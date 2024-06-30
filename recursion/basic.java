package recursion;

public class basic {
    public static void main(String[] args) {
        printNum1(1);
    }
    static void printNum1(int n){
        System.out.println(n + " ");
        printNum2(n+1);
    }static void printNum2(int n){
        System.out.println(n + " ");
        printNum3(n+1);
    }static void printNum3(int n){
        System.out.println(n + " ");
        printNum4(n+1);
    }
    static void printNum4(int n){
        System.out.println(n + " ");
        printNum5(n+1);
    }
    static void printNum5(int n){
        System.out.println(n + " ");
    }

}
