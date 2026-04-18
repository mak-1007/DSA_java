package String;

import java.util.Scanner;

public class StringBuilderFn {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // ================================
        // 1. INPUT
        // ================================

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        // ================================
        // 2. BASIC STRINGBUILDER OPERATIONS
        // ================================

        StringBuilder sb = new StringBuilder(str);

        // charAt → access character
        System.out.println("Character at index 0: " + sb.charAt(0));

        // setCharAt → modify character
        sb.setCharAt(0, 'M');
        System.out.println("After setCharAt: " + sb);

        // insert → insert at index
        System.out.println("Insert function:");
        sb.insert(2, "U");
        System.out.println(sb);

        // delete → remove character
        System.out.println("Delete function:");
        sb.deleteCharAt(2);
        System.out.println(sb);

        // append → add at end
        System.out.println("Append function:");
        sb.append('L');
        System.out.println(sb);

        // length
        System.out.println("Length of StringBuilder: " + sb.length());


        // ================================
        // 3. PERFORMANCE COMPARISON
        // ================================
        int n = 10000;

        // Using String (slow)
        long start = System.currentTimeMillis();

        String strg = "";
        for (int i = 0; i < n; i++) {
            strg += i;   // creates new object every time
        }
        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println("\nTime taken using String: " + duration + " ms");

        // Using StringBuilder (fast)
        long start2 = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb2.append(i); // modifies same object
        }

        long end2 = System.currentTimeMillis();
        long duration2 = end2 - start2;

        System.out.println("Time taken using StringBuilder: " + duration2 + " ms");

        sc.close();
    }
}