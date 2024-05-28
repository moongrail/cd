package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {
    @Test
    void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }

    @Test
    void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    void testDiamond0() {
        assertEquals(null, Diamond.print(0));
    }

    @Test
    void testDiamondMinus2() {
        assertEquals(null, Diamond.print(-2));
    }

    @Test
    void testDiamond2() {
        assertEquals(null, Diamond.print(2));
    }
}