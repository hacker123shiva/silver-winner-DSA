import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || stack.pop() != corres(ch))
                    return false;
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    private static char corres(char ch) {
        if (ch == ')')
            return '(';
        else if (ch == ']')
            return '[';
        else
            return '{';
    }
}
