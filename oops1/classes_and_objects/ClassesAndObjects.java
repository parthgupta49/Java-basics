package oops1.classes_and_objects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student steve = new Student(49,"Steve Smith",110.0f);
        Student david = steve;
//        steve.name = "David Warner";
//        david.name = "David Warner";
//        System.out.println(steve.name);
//        System.out.println(steve.marks);
//        System.out.println(steve.rNo);
//        steve.changeName("david Warner");
//        Student mitchell = new Student();
//        System.out.println(mitchell.name);
//        steve.greeting();
//        david.greeting();
//        System.out.println(david.name);
        steve.name = "I am changing this name which needs to be calculated";
        david.greeting();
        System.out.println(david.name);
    }
}
