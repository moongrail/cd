package kyu8;

public class CharProblem {
    public static int howOld(final String herOld) {
        //your code here, return correct age as int ; )
        return Integer.parseInt(herOld.replaceAll("\\D", ""));
    }
}
