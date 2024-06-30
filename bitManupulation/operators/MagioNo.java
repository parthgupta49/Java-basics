package bitManupulation.operators;

public class MagioNo {
    public static void main(String[] args) {
        int n = 99805;
        long base = 5;
        long sum = 0L;
        while (n>0){
            int last =  (n & 1);
            n = n >> 1;
            sum+=last*(base);
            base = base*5;
//            System.out.println(i++);
        }
        System.out.println(sum);
//        System.out.println(Math.pow(2,3));
    }
}
