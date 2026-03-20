// Service class (Encapsulation + Single Responsibility)
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize input (optional improvement)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer approach (internal logic)
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}


// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Racecar";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
