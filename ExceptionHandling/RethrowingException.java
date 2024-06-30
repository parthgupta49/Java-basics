package ExceptionHandling;

public class RethrowingException {
    static void viv(){
        try{
            throw new NullPointerException("Software");
        }
        catch (NullPointerException exception){
            System.out.println("viswass");
            System.out.println(exception);
            throw exception; // this is rethrowing the exception
        }
    }

    public static void main(String[] args) {
        try{
            viv();
        }
        catch (NullPointerException exception){
            System.out.println("JavaRace");
        }
    }
}

