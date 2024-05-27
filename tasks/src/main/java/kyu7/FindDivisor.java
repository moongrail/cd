package kyu7;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        if (n == 0) return 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) result++;
        }

        return result;
    }
}
