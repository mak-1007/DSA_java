package Fucntions;

import java.util.Scanner;

public class Q4countDigit {
    public static void main(String args[]) {

        // Asking user to enter a number
        System.out.println("enter the number input");

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // n stores the number entered by user
        int n = sc.nextInt();

        // c will count how many digits are there
        int c = 0;

        // Loop runs until the number becomes 0
        while (n > 0) {

            // Remove the last digit of the number
            n = n / 10;

            // Increase digit count
            c++;
        }

        // Print total number of digits
        System.out.println(c);
    }
}
