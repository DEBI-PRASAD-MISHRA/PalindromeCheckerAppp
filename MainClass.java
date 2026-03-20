public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome (two-pointer approach)
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}