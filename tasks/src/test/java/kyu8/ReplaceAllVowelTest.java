package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceAllVowelTest {
    @Test
    void basicTests() {
        assertEquals("H!!",      ReplaceAllVowel.replace("Hi!"));
        assertEquals("!H!! H!!", ReplaceAllVowel.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    ReplaceAllVowel.replace("aeiou"));
        assertEquals("!BCD!",    ReplaceAllVowel.replace("ABCDE"));
    }
}