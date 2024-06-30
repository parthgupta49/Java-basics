package oops1.classes_and_objects;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 24;
//        Integer num1 = 45;
//        Integer num2 = 145;
//        swap(num1,num2);
//        System.out.println(a+" "+b);
//        System.out.println(num1+" "+num2);
//        final int bonus = 2;
//        Student punter = new Student();
//        Student justin = new Student(23,"Justin Langer",67.3f);
//        punter = justin;
//        punter.name = "Ricky Ponting";
//        System.out.println(punter.name);
//        Student st1 = new Student();
//        Student st3 = new Student();
//        final Student st2 = st1;
//        //st2 = st3;
//        System.out.println(st2.name);
        WrapperClass obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new WrapperClass();
        }
    }
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
