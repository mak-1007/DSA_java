package String;

import java.util.Scanner;

public class Basics {

    // ================================
    // 1. Reverse String
    // Question: Reverse a string without using built-in functions
    // ================================
    public static void reverseString(String str) {

        String rv = "";

        // Traverse string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            rv += str.charAt(i);
        }

        System.out.println("Reversed String: " + rv);
    }

    // ================================
    // 2. Print All Substrings
    // Question: Print all substrings of a string
    // ================================
    public static void printAllSubstring(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + "\t");
            }
            System.out.println();
        }
    }

    // ================================
    // 3. Traverse String
    // Question: How to traverse a string?
    // ================================
    public static void traverseString(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Index " + i + " → " + str.charAt(i));
        }
    }

    // ================================
    // 4. next() vs nextLine()
    // Question: What is the difference?
    // ================================
    public static void nextVsnextLine(Scanner sc) {

        System.out.println("Enter a single word:");
        String word = sc.next();
        System.out.println("Word: " + word);

        sc.nextLine(); // clear buffer

        System.out.println("Enter a full sentence:");
        String sentence = sc.nextLine();
        System.out.println("Sentence: " + sentence);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // ================================
        // INPUT DEMO
        // ================================
        nextVsnextLine(sc);

        // ================================
        // LENGTH
        // ================================
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Length: " + sentence.length());

        // ================================
        // CHAR ACCESS
        // ================================
        if (sentence.length() > 3) {
            char ch = sentence.charAt(3);
            System.out.println("Character at index 3: " + ch);
        }

        // ================================
        // TRAVERSAL
        // ================================
        traverseString(sentence);

        // ================================
        // SUBSTRING
        // ================================
        System.out.println("Enter a word:");
        String word = sc.next();

        printAllSubstring(word);

        // ================================
        // CONCATENATION
        // ================================
        String concat = word + " " + sentence;
        System.out.println("Concatenated: " + concat);

        // Add character
        concat += 'a';

        // Add number
        concat += 10;

        System.out.println("After adding char and number: " + concat);

        // ================================
        // STRING + NUMBER BEHAVIOR
        // ================================
        System.out.println("hello" + 10 + 20);   // hello1020
        System.out.println(10 + 20 + "hello");   // 30hello

        // ================================
        // SPLIT
        // ================================
        String splitStr = "mohammad aman khan";
        String[] parts = splitStr.split(" ");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

        // ================================
        // REVERSE STRING
        // ================================
        reverseString(sentence);

        sc.close();
    }
}