package interfaces.NestedInterface;

public class NestedInterface {
    interface A{
        int a = 32;
        default void helloBaby(){
            System.out.println("I am great baby!!!!!");
        }
    }
}
class B implements NestedInterface.A{
    int a = 23;

}
