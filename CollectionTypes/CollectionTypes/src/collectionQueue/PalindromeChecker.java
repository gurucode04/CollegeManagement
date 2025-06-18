package collectionQueue;

import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word to check for palindrome: ");
        String input = scanner.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();  // Remove non-alphabetic characters and convert to lowercase
        
        ArrayDeque<Character> deque = new ArrayDeque<>();
        
        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        
        // Check for palindrome
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Is the word a palindrome? " + isPalindrome);
    }
}
