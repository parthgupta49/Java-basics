package oops3.inheritance;

public class BoxWeight extends Box{
    int weight;
//    BoxWeight(){
//        this.weight = weight;
//    }
    BoxWeight(int side,int weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(int l, int b, int h, int weight) {
        // doubt if we can do this like this |>
        this.weight = weight;
        this.l = l;
        this.b = b;
        this.h = h;
        // then why do we use something like this |>
//        super(l,b,h);

    }
}
