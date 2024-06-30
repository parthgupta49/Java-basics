package CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomisedList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomisedList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        // cpy the current items in to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
        data[index] = val;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data) +" " + "size = "+size;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
////        list.get(0);
////        list.set(1,34);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        CustomisedList list = new CustomisedList();
//        list.add(5);
//        list.add(23);
//        list.add(1);
//        for (int i = 0; i < 13; i++) {
//            list.add(i*2);
//        }
//        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        ArrayList<> list2 = new ArrayList<>();
//        list2.remove()
//        list2.add("helloWorld");
//        ArrayList list2 = new ArrayList();
//        list2.add("hellowordl");
//        list2.add(21);
//        System.out.println(list2);
//        CustomisedList a[63];

    }

}
