package interfaces.practiceInterfaces;

public class Practical implements Practice{
    int a = 233;
    static void career(){
        System.out.println("Hello I am in Practical class implementing Practice interface");
    }
    @Override
    public void plan() {
        System.out.println("Hello i am in Practical class");
    }
    @Override
    public void partner(){
        System.out.println("Hello i am in Practical class : Partner function");
    }

}
