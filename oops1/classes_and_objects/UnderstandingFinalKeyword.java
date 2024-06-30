package oops1.classes_and_objects;

public class UnderstandingFinalKeyword {
    public static void main(String[] args) {
//        final Emp kedar = new Emp("Kedhar Jadhav",23);
//        final int a = 23;
//        a = 43;
//        kedar.name = "Hello steve";
        /*doubt section
        Emp now;
        for (int i = 0; i < 1000000; i++) {
            now = new Emp();
        }
        now = new Emp();
        System.out.println(now.name);
        */

//        kedar = emp1;


    }

}
class Emp{
    String name;
    int empId;

    public Emp() {
        this.name = "ijf";
        this.empId = 23;
    }
    int i =0;

    @Override
    protected void finalize()   {
        System.out.println("Object is destroyed ");
    }
}