package Fucntions;

import java.util.Scanner;

public class Q3fibonacci {
    public static void main(String[] args) {

        // Asking user for input
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);

        // n represents how many Fibonacci numbers we want
        int n = sc.nextInt();

        // f = first term of Fibonacci series (0)
        int f = 0;

        // s = second term of Fibonacci series (1)
        int s = 1;

        // th will store the third (next) term
        int th;

        // Printing first two Fibonacci numbers
        System.out.println(f);
        System.out.println(s);

        // Loop to generate remaining Fibonacci numbers
        for (int i = 0; i <= n; i++) {

            // Next Fibonacci number = sum of previous two
            th = f + s;

            // Move f to s (shift forward)
            f = s;

            // Move s to th (shift forward)
            s = th;

            // Print the newly generated Fibonacci number
            System.out.println(th);
        }
    }
}
