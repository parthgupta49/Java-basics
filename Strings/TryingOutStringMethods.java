package Strings;

import java.util.regex.*;
import java.util.Scanner;
//import java.util.Arrays;

 public class TryingOutStringMethods {
    public static void main(String[] args) {
        String a = "Hello World";
        //System.out.println(a.indexOf('i'));
        // returns -1 if the character passed here is not present
        //System.out.println(a.indexOf("rld"));
        //System.out.println(a.indexOf('o',8));
        // the second integer given as argument will be the starting index to start the search for the passed character if it is not found it will give -1.
        //System.out.println(a.indexOf("o Wor",5));

        String b = new String("hell");
        String c = "Hello hello hello hello";
        //String d = b.intern();
        //System.out.println(c==d);
        //System.out.println(b==d);
        //System.out.println(c.lastIndexOf('l'));
        // this will just give me the last occurrence of the given character argument in the String
        //System.out.println(c.lastIndexOf('l',22));
        //here its searching for the character given as first argument starting from the index given as second argument and it is moving backwards to search for the passed character value and when it finds the similar value it will just give its index..

        //System.out.println(c.lastIndexOf("Hello") +""+ c.length());
        // this will just give me the last occurrence of the string "Hello" in the given string..
        //System.out.println(c.lastIndexOf("Hello",22));
        // this will give me the index of the given argument string start searching from the given index and this will move backwardly
        String name = "Parth plays well.";
        String name2 = "Parth.*";
        //System.out.println(name.matches(name2));
        // The matches method checks if the entire string matches the pattern. If you want to find a pattern within a string, you might consider using other methods like Pattern and Matcher from the java.util.regex package.
        //To summarize, the matches method is primarily used for pattern matching using regular expressions, while the equals method is used for comparing the content of two strings for exact equality.

        String x = "steve Smith is a Rockstar";
        //System.out.println(x.replace("stu","q"));
        // here if the string has the substring as passed in the first arugment it will replace with the second argument passed in all occurrences.
        String test = "steve Smith49 is a Rockstar4931\nThis is Australian National Cricket 49Team";
        //System.out.println(test.replaceAll("49.*"," Rankings#1"));
        /*
        output - :
        steve Smith Rankings#1
This is Australian National Cricket  Rankings#1
        */
        String test1 = "steve Smith49 is a Rockstar4931\nThis is Australian National Cricket 49Team";
        //System.out.println(test1.replaceFirst("49.*"," Rank:1"));
        /*
        steve Smith Rank:1
This is Australian National Cricket 49Team
        */
        // this will only change the first occurrence of the given regular expression.. not every occurrence like replaceAll method..

        String trimm = "                   Parth was a leg-spinner    ";
//        System.out.println(trimm);
//        System.out.println(trimm.trim());

        String upper = "steve";
//        System.out.println(upper.toString());
//
//        String charArray = "steve Smith";
//        char[] arr = charArray.toCharArray();
//        System.out.println(arr);
//        for (char i : arr) {
//            System.out.print(i+" ");
//        }
//        String substr = "Hello World";
//        System.out.println(substr.substring(5));
//        System.out.println(substr.substring(5,10));
//        String ab = new String("Hello");
//        String ba = "Hello";
//        String ca = ab.intern();
//        System.out.println(ca==ba);

//        String love = "Chole Bature,Shahi Paneer,Paneer Butter Masala";
//        String[] love1 = love.split(",",5);
//        for (String i :
//                love1) {
//            System.out.print(i + " ");
//        }
        StringBuilder str = new StringBuilder();
//        str.replace(0,str.length()-1,"New StringBuffer");
//        String newString = str.toString();
//        str.insert(2,"JAVVA");
//        System.out.println(str.capacity());
        str.append("hello Worlddddddd");
//        System.out.println(str.capacity());
// how can i print the reverse of a string without using an in built function
//        String strToReverse = "Hello i am elias how are you";
//        char[] temp = strToReverse.toCharArray();
//        char[] reversedCharacter = new char[temp.length];
//        int j = 0;
//        for (int i = temp.length-1; i >= 0  ; i--) {
//            reversedCharacter[j++] = temp[i];
//        }
//        System.out.println(reversedCharacter);
//
//        String toReverse = "heeyy";
//        String reverseString = "";
//        int len = toReverse.length();
//        int i = 0;
//        while (i!=len){
//            reverseString = reverseString + toReverse.charAt(len-1-i++);
//        }
//        System.out.println(reverseString);

//        int i = Integer.parseInt("10i");
        // this will throw an exception cauze of that i which will be a runtime exception of java.lang.NumberFormatException
        // since the string i can't be converted into an integer..
        //int i = Integer.parseInt("10");
        // this will work fine
//        System.out.println(i);
        Scanner scanner = new Scanner(System.in);
        boolean abcd = true;
       /* while (abcd){
        System.out.print("Enter an email address: ");
        String email = scanner.next();

        String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }


        System.out.println("Press 0 to exit");
        int inp = scanner.nextInt();
        if (inp==0){
            abcd = false;
        }

    }*/
        Integer integer = 23;
        Integer integer1 = 23;
//        System.out.println(integer.equals(integer1));


//        Integer i = 10;
//        Integer j = 11;
//        Integer k = ++i; // INCR K = 11
//        System.out.println("k == j is " + (k == j));
//        System.out.println("k.equals (j) is " + k.equals(j));
//
//        int helloWorld = Integer.parseInt("10i");
//        int div = 1/0;
    }

    /*class Point2D {
        private int x, y;

        public Point2D(int x, int y) {
            x = x;
        }

        public String toString() {

            return "[" + x + ", " + y + "]";

        }

        public void static main(String[] args) {

            Point2D point = new Point2D(10, 20);

        }
    }*/
}

