package interfaces.anotherTimePractice;

interface Interfaces {
    void greet();
    default void meet(){
        System.out.println("Hey i am in interface interfaces");
    }
}
