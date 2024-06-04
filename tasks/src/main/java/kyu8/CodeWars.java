package kyu8;

public class CodeWars {
    public static int strCount(String str, char letter) {
        //write code here
        return (int)str.chars().filter(x -> x == letter).count();
    }
}
