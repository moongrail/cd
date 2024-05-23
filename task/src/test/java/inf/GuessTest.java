package inf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessTest {
    @Test
    void test() {
        assertEquals(12, Guess.guess(1, 15, 12));
    }
}