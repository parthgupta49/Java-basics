package ExceptionHandling.chainedException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            process();
        } catch (MainException e) {
            System.out.println("MainException caught: " + e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Caused by: " + cause.getClass().getName() + ": " + cause.getMessage());
            }
        }
    }

    public static void process() {
        try {
            calculate();
        } catch (ArithmeticException e) {
//            throw new MainException("An error occurred while processing.", new CalculationException("Division by zero"), e);
        }
    }


    public static void calculate() {
        try {

        int result = 10 / 0; // This line throws an ArithmeticException
        }
        catch (ArithmeticException exception){
            System.out.println("Do not divide by zero");
            throw exception;
        }
    }
}

class MainException extends RuntimeException {
    public MainException(String message, Throwable cause) {
        super(message, cause);
    }
}

class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}
