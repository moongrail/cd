package kyu6;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountCharactersInYourStringTest {
    @Test
    @Order(1)
    void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, CountCharactersInYourString.count(""));
    }

    @Test
    @Order(2)
    void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, CountCharactersInYourString.count("a"));
    }

    @Test
    @Order(3)
    void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, CountCharactersInYourString.count("aabbbac"));
    }

    @Test
    @Order(4)
    void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, CountCharactersInYourString.count("abc"));
    }

    @Test
    @Order(5)
    void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, CountCharactersInYourString.count("aaaaa"));
    }

    @Test
    @Order(6)
    void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = CountCharactersInYourString.count("aabb");
        assertEquals(expected, actual);
    }

}