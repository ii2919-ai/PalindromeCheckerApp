import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();
            if (input.charAt(i) != poppedChar) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}