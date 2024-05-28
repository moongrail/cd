package kyu7;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        int length = word.length();
        int mid = length / 2;
        if (length % 2 == 0) {
            return word.substring(mid - 1, mid + 1);
        } else {
            return String.valueOf(word.charAt(mid));
        }
    }
}
