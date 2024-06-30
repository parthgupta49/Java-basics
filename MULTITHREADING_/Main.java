package MULTITHREADING_;

public class Main {
    public static void main(String[] args) {
        JavaThread thread1 = new JavaThread();
        JavaThread2 thread2 = new JavaThread2();
        thread1.start();
        thread2.start();
    }
}
