package CustomArrayList.LearningAgain;

import java.util.Arrays;

public class LearningAgain {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public LearningAgain() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int size(){
        return size;
    }

    public void remove(){
        size--;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "LearningAgain{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        LearningAgain list = new LearningAgain();
        list.add(4);
        list.add(43);
        list.add(24);
        list.add(41);
        System.out.println(list);
    }
}
