package grid75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void testOne(){
        String s = "()";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    void testTwo(){
        String s = "()[]{}";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    void testThree(){
        String s = "(]";
        assertFalse(ValidParentheses.isValid(s));
    }

    @Test
    void testFour(){
        String s = "(]";
        assertFalse(ValidParentheses.isValid(s));
    }

    @Test
    void testFive(){
        String s = "(()[]{})";
        assertTrue(ValidParentheses.isValid(s));
    }

    @Test
    void testSix(){
        String s = "([()][]{})";
        assertTrue(ValidParentheses.isValid(s));
    }
}