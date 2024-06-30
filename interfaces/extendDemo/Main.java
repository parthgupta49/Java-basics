package interfaces.extendDemo;

public class Main implements A,B{
    @Override
    public void food() {
        System.out.println("I am in Main class");
    }



    public static void main(String[] args) {
        A obj = new Main();
        A.Static();
    }



}
