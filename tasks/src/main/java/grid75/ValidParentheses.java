package grid75;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                parentheses.push(')');
            } else if (c == '[') {
                parentheses.push(']');
            } else if (c == '{') {
                parentheses.push('}');
            }else if (parentheses.isEmpty() || parentheses.pop() != c) {
                return false;
            }
        }

        return parentheses.isEmpty();
    }
}
