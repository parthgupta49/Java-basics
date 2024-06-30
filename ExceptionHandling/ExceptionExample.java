package ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 2,b=0;
//        try {
////          String name = "Steve";
////          if (name.equals("Steve")){
////              throw new MyCustomeException("Name should be PARTH");
////          }
//
//        }
//
//        catch (Exception e){
//            System.out.println("this is normal exception");
//        }
        divides(a,b);
        try{
        divides(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

    static void divides(int a,int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("you should not divide by zero");
        int c = a/b;
        System.out.println(c);
    }
}
