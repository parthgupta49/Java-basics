package CustomArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }
    public void add(int value){
        if (isFull()){
            resize();
        }
        data[size++] = value;
    }


    public void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
        }
            data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int remove(){
        return data[--size];
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + " " +
                ", size=" + size +
                '}';
    }

    public void set(int index, int value){
        data[index] = value;
    }
    public static void main(String[] args) {
//        CustomisedList list = new CustomisedList();
//        for (int i = 0; i < 5; i++) {
//            list.add(i*2);
//        }
////        System.out.println(list.get(3));
//        list.set(7,34);
////        System.out.println(list.size());
//        System.out.println(list);
//        list.remove();
//        System.out.println(list);
        ArrayList list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(223);
        list.add(3);
        list.add(2);



    }
}
