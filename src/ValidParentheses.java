import java.util.Stack;
public class ValidParentheses {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char bracket : s.toCharArray()) {
                if (bracket == '(' || bracket == '[' || bracket == '{') {
                    stack.push(bracket);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if (bracket == ')' && top != '(' ||
                            bracket == ']' && top != '[' ||
                            bracket == '}' && top != '{') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        public static void main(String[] args) {
            // Пример использования:
            String parenthesesString = "{[()]}";
            boolean result = isValid(parenthesesString);
            System.out.println("Are the parentheses valid? " + result);
        }
    }
