package bitManupulation.operators;

public class OddEven {
    public static void main(String[] args) {
        int num = 53;
        if ((num & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("even");
    }
}
