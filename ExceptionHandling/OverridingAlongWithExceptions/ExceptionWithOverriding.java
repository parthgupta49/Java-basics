package ExceptionHandling.OverridingAlongWithExceptions;

public class ExceptionWithOverriding {
    public static void main(String[] args) {
        Test obj = new Child();
        try{
            obj.print();
        }
        catch(Exception exception){
            System.out.println("cjbkh");
        }
    }
}
