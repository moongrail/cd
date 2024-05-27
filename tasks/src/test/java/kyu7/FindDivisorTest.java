package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDivisorTest {
    FindDivisor fd = new FindDivisor();

    @Test
    void oneTest() {
        assertEquals(1, fd.numberOfDivisors(1));
    }

    @Test
    void fourTest() {
        assertEquals(3, fd.numberOfDivisors(4));
    }

    @Test
    void fiveTest() {
        assertEquals(2, fd.numberOfDivisors(5));
    }

    @Test
    void twelveTest() {
        assertEquals(6, fd.numberOfDivisors(12));
    }

    @Test
    void thirtyTest() {
        assertEquals(8, fd.numberOfDivisors(30));
    }
}