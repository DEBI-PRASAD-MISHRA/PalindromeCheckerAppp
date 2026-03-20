public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Convert string to char array
        char[] arr = original.toCharArray();

        // Two pointers
        int start = 0;
        int end = arr.length - 1;

        // Boolean flag
        boolean isPalindrome = true;

        // Compare using while loop
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}