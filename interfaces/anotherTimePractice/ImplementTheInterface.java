package interfaces.anotherTimePractice;

public class ImplementTheInterface implements Interfaces{

    @Override
    public void greet() {

    }
    @Override
    public void meet(){
        System.out.println("I am in class ");
    }

    public static void main(String[] args) {
        Interfaces obj = new ImplementTheInterface();
        obj.meet();
    }
}
