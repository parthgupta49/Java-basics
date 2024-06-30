package interfaces.practiceInterfaces;

public interface Practice {
    int a = 23;
    Object ab = 32;
    static void career(){
        System.out.println("Hello world");
    }
    void plan();
    float b = 23;
    default void partner(){
        System.out.println("Hello i am in Practice Interface");
    }


}
