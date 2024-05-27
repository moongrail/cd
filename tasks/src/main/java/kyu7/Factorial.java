package kyu7;

public class Factorial {
    public static int factorial(int n) {
        // Happy coding :-)
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
