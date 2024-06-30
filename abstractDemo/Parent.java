package abstractDemo;

public abstract class Parent {
     static void greetings(){
          System.out.println("Hey i am in Parent class :) ");
     }
     static void hello(){
          System.out.println("Aami in abstract class Parent");
     }
//     final int a;
     abstract void career();
     abstract void partner();
     void greet(){
          System.out.println("Hey, I am the Parent");
     }
     static void money(){
          System.out.println("I have a hell lot of money but i am not going to give it to my children's");
     }
     int paisa = 1000000;

     protected Parent() {
          System.out.println("This is parent constructor");
     }

     public static void main(String[] args) {
//          System.out.println(Parent.a);
     }
}
