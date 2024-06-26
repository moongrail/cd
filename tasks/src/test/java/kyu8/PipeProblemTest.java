package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PipeProblemTest {
    @Test
    void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, PipeProblem.pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, PipeProblem.pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, PipeProblem.pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, PipeProblem.pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, PipeProblem.pipeFix(new int[] {1,2,3}));
    }
}