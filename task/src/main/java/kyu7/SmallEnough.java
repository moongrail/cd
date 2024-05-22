package kyu7;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a)
                .noneMatch(i -> i > limit);
    }
}
