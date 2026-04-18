package String;

import java.util.Scanner;

public class StringCompression {

    // ================================
    // 1. Compression without count
    // Input: aaabbcc → Output: abc
    // ================================
    public static String compression(String str) {

        String result = "";

        // Add first character
        result += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            // Add only when character changes
            if (curr != prev) {
                result += curr;
            }
        }

        return result;
    }

    // ================================
    // 2. Compression with count
    // Input: aaabbcc → Output: a3b2c2
    // ================================
    public static String compressionWithCount(String str) {

        String result = "";

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            // Same character → increase count
            if (curr == prev) {
                count++;
            }
            else {
                // Add previous character
                result += prev;

                // Add count only if > 1
                if (count > 1) {
                    result += count;
                }
                // Reset count
                count = 1;
            }
        }
        //  Handle last group
        result += str.charAt(str.length() - 1);

        if (count > 1) {
            result += count;
        }

        return result;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("Compression (no count): " + compression(str));
        System.out.println("Compression (with count): " + compressionWithCount(str));

        sc.close();
    }
}