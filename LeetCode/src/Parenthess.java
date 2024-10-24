import java.util.Stack;

public class Parenthess {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for  ( char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }

            }

            return true;

        }

    public static void main(String[] args)
    {
        String s = "([{}])";


        if (isValid( s)) {
            System.out.println("Balanced ");
        }
        else
            System.out.println("Not Balanced ");
    }
}


