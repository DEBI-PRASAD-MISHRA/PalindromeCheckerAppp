public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Call recursive function
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(str, start + 1, end - 1);
    }
}