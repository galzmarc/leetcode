import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if (!isValidPair(top, c)) return false;
      }
    }
    return stack.isEmpty();
  }

  private boolean isValidPair(char a, char b) {
    return (a == '(' && b == ')') ||
      (a == '[' && b == ']') ||
      (a == '{' && b == '}');
  }
}
