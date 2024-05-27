package kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            long sum = 0;
            long num = i;
            int length = String.valueOf(num).length();
            while (num > 0) {
                sum += Math.pow(num % 10, length);
                num /= 10;
                length--;
            }
            if (sum == i) {
                result.add(i);
            }
        }
        return result;
    }
}
