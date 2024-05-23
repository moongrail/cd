package kyu8;

import java.util.stream.IntStream;

public class PipeProblem {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        return IntStream.iterate(
                        numbers[0],
                        i -> i <= numbers[numbers.length - 1],
                        i -> i + 1)
                .toArray();
    }
}
