package knut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EuTest {
    @Test
    void test() {
        assertEquals(17657, Eu.nod(28851538, 1183019));
        assertEquals(1, Eu.nod(18, 35));
        assertEquals(17, Eu.nod(119, 544));
    }
}