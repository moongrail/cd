package kyu8;

import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (arr.length == 0) return new int[0];
        if (arr.length < n) {
            return arr;
        }
        return Arrays.copyOf(arr, n);
    }
}
