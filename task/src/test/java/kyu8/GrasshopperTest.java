package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperTest {
    @Test
    void testAddFive() {
        assertEquals(10, Grasshopper.addFive(5));
    }

    @Test
    void testAddZero() {
        assertEquals(5, Grasshopper.addFive(0));
    }

    @Test
    void testAddNegativeFive() {
        assertEquals(0, Grasshopper.addFive(-5));
    }

    @Test
    void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            assertEquals(rand + 5, Grasshopper.addFive(rand));
        }
    }
}