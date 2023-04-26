package Easy;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        // Input test
        // Input: s = "()"
        // Output: true
        String myString = "()";
        System.out.println("Output should be true: " + isValid(myString));
        
    }

    public static boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }

        Stack<Character> myStack = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c =='[' || c == '{') {
                myStack.push(c);
            }else if(c == ')' && !myStack.isEmpty() && myStack.peek() == '(') {
                myStack.pop();
            }else if(c == ']' && !myStack.isEmpty() && myStack.peek() == '[') {
                myStack.pop();
            }else if(c == '}' && !myStack.isEmpty() && myStack.peek() == '{') {
                myStack.pop();
            }else {
                return false;
            }
        }
        return myStack.isEmpty();
    }
}
