package examPreparation;

public class Nestedclasses {
    private static int count;

    public Nestedclasses(int count) {
        this.count = count;
    }

    static class Innerclass{
        void noUse(){
            System.out.println(count);
        }
        public static void main(String[] args) {
            Nestedclasses obj = new Nestedclasses(23);
            System.out.println(obj.count);
            Nestedclasses.Innerclass obj1 = new Nestedclasses.Innerclass();
        }
    }

}
