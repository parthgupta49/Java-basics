package abstractDemo;

public class Child extends Parent {

//    static void hello(){
//        System.out.println("I am in CHild class");
//    }

    int mon;
    public Child() {
        System.out.println("This is child constructor");
    }

    @Override
    void greet() {
        System.out.println("RIght now i am in child class");
        this.mon = super.paisa;
        System.out.println(this.mon);
    }
    static void greetings(){
        System.out.println("Hey i am in child class ");
    }


    @Override
    void career() {
        System.out.println("I am going to become a software engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Anisha");
    }


}