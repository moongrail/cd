package kyu7;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", ""))
                .reverse()
                .toString(); //coding and coding..
    }
}
