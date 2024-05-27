package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoundToTheNextMultipleOf5Test {
    @Test
    void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40},
                {-5,-5},
                {-1,0}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            assertEquals(
                                    testCase[1],
                                    RoundToTheNextMultipleOf5.roundToNext5(testCase[0]));
                        });
    }
}