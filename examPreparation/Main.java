package examPreparation;

import java.io.IOException;
import java.util.Scanner;
import static java.io.InputStream.nullInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        int exception = System.in.read();
        char a = (char) exception;
        System.out.println(a);
        while (System.in.available() > 0) {
            System.in.read();
        }
        int exception1 = System.in.read();
        System.out.println(((char)exception1));
        Scanner sc = new Scanner(System.in);
    }
}
