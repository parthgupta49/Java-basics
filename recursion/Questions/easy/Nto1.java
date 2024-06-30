package recursion.Questions.easy;

public class Nto1 {
    public static void main(String[] args) {
        printNto1(5);
    }
    static void printNto1(int num){
        if (num==0)
            return;
        printNto1(num-1);
        System.out.print(num);
    }
}
