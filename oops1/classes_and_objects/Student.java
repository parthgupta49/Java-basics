package oops1.classes_and_objects;

public class Student {
    int rNo;
    String name;
    float marks;
//    Student(int rNo,String name,float marks){
//        this.rNo  = rNo;
//        this.name = name;
//        this.marks= marks;
//
//    }
    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    Student(Student other){
        this.rNo   = other.rNo;
        this.name  = other.name;
        this.marks = other.marks;
    }
    Student(){
        this(0,"Default name",0.0f);
    }
    Student(int rNo,String name,float marks){
        this.rNo   = rNo;
        this.name  = name;
        this.marks = marks;
    }

}
