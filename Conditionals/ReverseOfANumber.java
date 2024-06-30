package Conditionals;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int number = 12345678;
        int newNumber = 0;
        while(number>0){
            int rem = number%10;
            newNumber = newNumber*10 + rem;
            number/=10;
        }
        System.out.println(newNumber);
    }
}
