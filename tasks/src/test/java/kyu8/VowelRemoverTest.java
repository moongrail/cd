package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelRemoverTest {
    @Test
    void test1() {
        assertEquals("hll", VowelRemover.shortcut("hello"));
        assertEquals("hw r y tdy?", VowelRemover.shortcut("how are you today?"));
        assertEquals("cmpln", VowelRemover.shortcut("complain"));
        assertEquals("nvr", VowelRemover.shortcut("never"));
    }
}