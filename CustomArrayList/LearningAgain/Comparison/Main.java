package CustomArrayList.LearningAgain.Comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student parth = new Student(37,85.99f);
        Student steve = new Student(36,99.93f);
//        if (steve.compareTo(parth)>0){
//            System.out.println("steve got more marks.. ");
//        } else if (steve.compareTo(parth)<0) {
//            System.out.println("Parth got more marks");
//        }
//        else
//            System.out.println("Both got the same");
        Student david = new Student(12,91);
        Student lyon = new Student(1,89);
        Student starcy = new Student(3,87);
        Student[] list = {parth,starcy,steve,lyon,david};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
