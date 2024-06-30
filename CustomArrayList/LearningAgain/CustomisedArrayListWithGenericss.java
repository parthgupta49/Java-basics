package CustomArrayList.LearningAgain;

import java.util.Arrays;

public class CustomisedArrayListWithGenericss<T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomisedArrayListWithGenericss() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T value){
        if (isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public int size(){
        return size;
    }
    public T remove(){
        T remove = (T) data[size--];
        return remove;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index,T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomisedArrayListWithGenericss{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomisedArrayListWithGenericss<Integer> list = new CustomisedArrayListWithGenericss<Integer>();
        list.add(12);
        list.add(132);
        list.add(1);
        list.add(213);
        System.out.println(list);
        System.out.println(list.size);
        System.out.println(list.isFull());
        list.set(1,344);



    }
    
}
