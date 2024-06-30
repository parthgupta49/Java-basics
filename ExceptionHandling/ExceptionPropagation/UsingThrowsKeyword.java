package ExceptionHandling.ExceptionPropagation;

import java.io.IOException;

public class UsingThrowsKeyword {
    void show(int num) throws IOException,ClassNotFoundException{
        if(num==1)
            throw new IOException("Exception Message1");
        else
            throw new ClassNotFoundException("Exception Message2");
    }
    public static void main(String[] args) {
        UsingThrowsKeyword obj = new UsingThrowsKeyword();
        try {

        obj.show(1);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
