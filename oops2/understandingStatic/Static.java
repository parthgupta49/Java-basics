package oops2.understandingStatic;

public class Static {
    int n;
    public static void main(String[] args) {
        fun();

    }

    static void fun(){
        Static obj = new Static();
        obj.n = 23;
        System.out.println(obj.n);
        obj.greeting();
    }
    void greeting(){
        System.out.println("I am greeting...");
    }
    void fun2(){
        greeting();
    }
}
