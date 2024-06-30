package ExceptionHandling;

import java.util.Arrays;

public class MyCustomeException extends Exception{
    public MyCustomeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int len = array.length;
    }
}
