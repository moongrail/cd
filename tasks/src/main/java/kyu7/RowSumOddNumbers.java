package kyu7;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        if (n <= 0) {
            return 0;
        }
        int firstNumber = n * n - n + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += firstNumber + (2 * i);
        }
        return sum;

        //😂😂🫵🏻🫵🏻😂😂😂🫵🏻🫵🏻🤣🤣
//        return n * n * n;
    }
}
