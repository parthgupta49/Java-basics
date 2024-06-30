package CustomArrayList.LearningAgain;

import java.util.Arrays;

public class LearningAgainCustomGenericArrayList<T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public LearningAgainCustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int size(){
        return size;
    }

    public T remove(){
        T remove = (T)(data[size--]);
        return remove;
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index,T value){
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
//        LearningAgainCustomGenericArrayList list = new LearningAgainCustomGenericArrayList();
        LearningAgainCustomGenericArrayList<Integer> list= new LearningAgainCustomGenericArrayList<Integer>();
        list.add(4);
        list.add(43);
        list.add(24);
        list.add(41);
        list.add(50);
//        list.add("Hello");
        System.out.println(list);
    }
}
