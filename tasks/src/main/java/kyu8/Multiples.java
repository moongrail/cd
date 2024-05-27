package kyu8;

import java.util.stream.IntStream;

public class Multiples {
    public static int[] find(int base, int limit) {
        // your code here
//        int size = limit / base;
//        int[] result = new int[size];
//
//        for (int i = 0, j = base; i < size; i++, j += base) {
//            result[i] = j;
//        }
//        return result;
        return IntStream.iterate(base, i -> i <= limit, i -> i + base).toArray();
    }
}
