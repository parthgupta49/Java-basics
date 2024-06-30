package oops2;

public class OuterClass {
    static class InnerClass {
        int race;
        String name;

        @Override
        public String toString() {
            return race + name;
        }

        public InnerClass(String name) {
            this.name = name;
        }
    }

        public static void main(String[] args) {
              InnerClass ob = new InnerClass("Steve smith");
              InnerClass bo = new InnerClass("David Warner");
//            System.out.println(ob.name);
//            System.out.println(bo.name);
            System.out.println(ob);

//            InnerClass obj1 = new InnerClass("Steve Smith");
//            InnerClass obj2 = new InnerClass("Ricky Punter");
//            obj1.race = 5;
//            obj2.race = 15;
//            System.out.println(obj1.race);
//            System.out.println(obj2.race);
//            System.out.println(obj1.name);
//            System.out.println(obj2.name);

        }

}
