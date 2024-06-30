package accessModifierCheckkk;

import accessModifiers.checkingProtected;

public class WillItWork extends checkingProtected {
    public static void main(String[] args) {
        WillItWork obj = new WillItWork();
//        System.out.println(obj.a);
        // this will not work bze a has protected access in the parent class so
//        we cannot use the variable outside that parent package with the Parent
//        reference we have to use
        obj.show();
        System.out.println(obj.a);
    }
    void show(){
        System.out.println("I am in Child class");
        display();
    }
}
