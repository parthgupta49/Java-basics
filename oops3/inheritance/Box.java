    package oops3.inheritance;

    public class Box {
        int l;
        int b;
        int h;
        Box(){
            this.l = -1;
            this.b = -1;
            this.h = -1;
        }Box(int side){
            this.l = side;
            this.b = side;
            this.h = side;
        }
        Box(int l, int b, int h) {
            this.l = l;
            this.b = b;
            this.h = h;
        }
    }
