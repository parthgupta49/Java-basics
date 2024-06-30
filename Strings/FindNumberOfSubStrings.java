package Strings;

public class FindNumberOfSubStrings {
    public static void main(String[] args) {
        String name = "Parth Gupta and Parth Gupta and Parth Gupta Anisha and";
        System.out.println(name.length());
        // we need to find at which all indexes and is coming
        searchSubstrings(name,"and");
        System.out.println(name.lastIndexOf("and"));
    }
    static void searchSubstrings(String str,String substring){

        int index = 0;
        while (str.indexOf(substring,index)>-1){
            index = str.indexOf(substring,index);
            System.out.println("Substring \"and\" occurs at index "+index);

            index++;
        }
    }
}
