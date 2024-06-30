package interfaces.NestedInterface;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.helloBaby();
        System.out.println(obj.a + " " + NestedInterface.A.a);
    }
}
