package interfaces.anotherTimePractice;

public class ShowingNestedInterfaces {
    private interface A{
        void delete();
    }

    public static void main(String[] args) {
//        B obj = new B();
//        obj.delete();
    }
    class B implements A{

        @Override
        public void delete() {
            System.out.println("Hello");
        }
    }

}
/*
class B implements ShowingNestedInterfaces.A{

    @Override
    public void delete() {
        System.out.println("I am in B class");
    }
}*/
