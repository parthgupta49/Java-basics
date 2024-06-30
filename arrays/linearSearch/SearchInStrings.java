package arrays.linearSearch;

import java.util.Locale;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Parth Gupta";
        char charToSearch = 'P';
        System.out.println(searchInStrings(str, charToSearch));
    }

    static boolean searchInStrings(String str, char targetCharacter) {
        str = str.toLowerCase();
        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetCharacter)
                return true;
        }
        */
//        using for - each loop
        for(char ch : str.toCharArray()){
            if(ch==targetCharacter)
                return true;
        }
        return false;
    }
}
