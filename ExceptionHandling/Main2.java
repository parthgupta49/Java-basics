package ExceptionHandling;

public class Main2 {
    public static void main(String[] args) {
        int a = 23;
        int b = 0;
        try {
            divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
//           this won't work bze the exception has been already caught so there is no point of catching the exception
//            again that too specific exception which is arithmetic exception

            System.out.println("this should be a normal exception ");
        }
        finally {
            System.out.println("no matter what this will always executes");
        }


    }
    static int divide (int a,int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("do not divide any number by zero");
        return a/b;
    }
}
