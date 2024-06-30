package CustomArrayList.LearningAgain;

public class RandomShit {
    public static void main(String[] args) {
//        byte num = 20;
//        System.out.println("<---java starts--->");
//        try{num = Byte.parseByte("128");}
//        catch (Exception e){
//            System.out.println("Exception is caught");
//            System.out.println(e);
//        }
        try{
            double x= 0.0;
            throw (new Exception("Thrown"));
        }
        catch (Exception e){
            System.out.println("Exception caught");
            return;
        }
        finally {
        System.out.println("** finally **");
        }
        

    }
}
