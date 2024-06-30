package interfaces;

public class MarkerInterface {
    public static void main(String[] args) {
        MarkerDemo obj = new MarkerDemo();
        if (obj instanceof P)
            obj.show();
        else
            System.out.println("Not permission");
    }
}
interface P{}
class MarkerDemo implements P {
    void show(){
        System.out.println("JavaRAce");
    }
}
