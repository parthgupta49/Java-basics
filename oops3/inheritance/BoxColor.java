package oops3.inheritance;

public class BoxColor extends BoxWeight{
    int color;

//    public BoxColor() {
//        super();
//        this.color = -1;
//    }

    public BoxColor(int weight, int color) {
        super(weight);
        this.color = color;
    }

    public BoxColor(int l, int b, int h, int weight, int color) {
        super(l, b, h, weight);
        this.color = color;
    }
    public BoxColor(int side, int weight, int color) {
        super(side, weight);
        this.color = color;
    }

    public static void main(String[] args) {
        BoxColor ob = new BoxColor(6,23,54);
        System.out.println(ob.color);
        System.out.println(ob.weight);
        System.out.println(ob.l);
        System.out.println(ob.b);
        System.out.println(ob.h);
    }
}
