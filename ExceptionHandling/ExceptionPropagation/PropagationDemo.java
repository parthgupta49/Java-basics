package ExceptionHandling.ExceptionPropagation;

import java.io.IOException;

public class PropagationDemo {
    void show(){
        throw new RuntimeException("This is an IO Exception");
    }
    void display(){
        show();
    }
    void print(){
        try {
            display();
        }
        catch (Exception exception){
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        PropagationDemo obj = new PropagationDemo();
        obj.print();
    }
}
