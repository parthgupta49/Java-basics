package ExceptionHandling.cllge;


public class TryingAgain {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
//            int c = a/b;
            divide(a,b);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("This will always execute..");
        }

    }
    static int divide(int a , int b) throws MyException{
        if (b==0)
            throw new MyException("Do not divide by zero");
        return a/b;
    }
}
