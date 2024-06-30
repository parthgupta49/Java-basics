package interfaces.extendDemo;

interface A {
    static void Static(){
        System.out.println("hello i am in interface A");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
