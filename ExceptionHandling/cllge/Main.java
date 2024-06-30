package ExceptionHandling.cllge;

import ExceptionHandling.MyCustomeException;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        try {

        TryingAgain.divide(3,0);
        }
        catch (MyException exception){
            System.out.println(exception.getMessage());
        }
    }
}
