import java.util.Stack;

public class ReverseString {
    public static void reverseStr(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder reverseStr = new StringBuilder();
        for (int i=stack.size(); i > 0; i--) {
            reverseStr.append(stack.pop());
        }
        System.out.println(reverseStr.toString());
    }
}
