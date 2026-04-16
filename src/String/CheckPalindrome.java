package String;

import java.util.Scanner;

public class CheckPalindrome {

    // ================================
    // Function: Check if string is palindrome
    // Logic: Compare characters from both ends
    // ================================
    public static boolean checkPalindrome(String str) {

        int i = 0;                    // start pointer
        int j = str.length() - 1;     // end pointer

        while (i <= j) {

            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            // If mismatch → not palindrome
            if (ch1 != ch2) {
                return false;
            }

            // Move inward
            i++;
            j--;
        }

        return true; // all matched
    }

    // ================================
    // Function: Print all palindromic substrings
    // Logic:
    // 1. Generate all substrings
    // 2. Check each substring
    // ================================
    public static void findSubstring(String str) {

        System.out.println("\nAll Palindromic Substrings:\n");

        // Outer loop → starting index
        for (int i = 0; i < str.length(); i++) {

            // Inner loop → ending index
            for (int j = i + 1; j <= str.length(); j++) {

                // Extract substring once (optimization)
                String sub = str.substring(i, j);

                // Check if palindrome
                if (checkPalindrome(sub)) {
                    System.out.println("Palindrome found: " + sub);
                }
            }

            // Separate groups for clarity
            System.out.println("-------------------");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("\nInput String: " + str);

        // Call function
        findSubstring(str);

        sc.close();
    }
}