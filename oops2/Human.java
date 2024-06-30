package oops2;

public class Human {
    int age;
    boolean married;
    static long population;

    public Human(int age, boolean married) {
        this.age = age;
        this.married = married;
        population+=1;
    }
}
