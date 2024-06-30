package oops2.understandingStatic;

public class InitialisingStaticVariables {
    static int a = 2;
    static int b;

    int sdCard = 32;
    static {
        System.out.println("I am in static block.. how's that");
        a = a * 5;
        b = a + 23;
    }

    public static void main(String[] args) {
        InitialisingStaticVariables obj = new InitialisingStaticVariables();
        System.out.println(InitialisingStaticVariables.a + " " + InitialisingStaticVariables.b);
        InitialisingStaticVariables.a += 5;
        System.out.println(InitialisingStaticVariables.a + " " + InitialisingStaticVariables.b);
        InitialisingStaticVariables obj1 = new InitialisingStaticVariables();
        System.out.println(InitialisingStaticVariables.a + " " + InitialisingStaticVariables.b);
    }
}
