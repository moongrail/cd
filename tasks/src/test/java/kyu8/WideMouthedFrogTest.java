package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WideMouthedFrogTest {
    @Test
    void fixedTests() {
        assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide",WideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}