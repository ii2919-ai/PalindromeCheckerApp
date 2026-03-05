import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        System.out.println("\n--- Comparing Dequeue and Pop ---");

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // Dequeue
            char fromStack = stack.pop();      // Pop

            System.out.println("Queue (Dequeue): " + fromQueue +
                    " | Stack (Pop): " + fromStack);

            if (fromQueue != fromStack) {
                isPalindrome = false;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("\nResult: The word is a PALINDROME");
        } else {
            System.out.println("\nResult: The word is NOT a palindrome");
        }

        scanner.close();
    }
}