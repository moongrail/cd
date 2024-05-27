package inf;

public class Guess {
    public static int guess(int a, int b, int x) {
        while (a != b) {
            if (x <= (a + b) / 2) {
                b = (a + b) / 2;
            } else {
                a = ((a + b) / 2) + 1;
            }
        }
        return a;
    }
}
