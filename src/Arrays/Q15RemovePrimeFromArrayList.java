package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Q15RemovePrimeFromArrayList {

    // ================================
    // Function: Check if number is prime
    // ================================
    public static boolean isPrime(int n) {

        // 0 and 1 are not prime
        if (n <= 1) return false;

        // Check divisibility till √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // divisor found → not prime
            }
        }

        return true; // no divisor → prime
    }

    // ================================
    // Function: Remove prime numbers
    // ================================
    public static void removePrimeFromArrayList(ArrayList<Integer> a1) {

        // Traverse from end to avoid index shifting issue
        for (int i = a1.size() - 1; i >= 0; i--) {

            int val = a1.get(i);

            // If element is prime → remove it
            if (isPrime(val)) {
                a1.remove(i);
            }
        }

        System.out.println("After removing prime numbers:");
        printArrayList(a1);
    }

    // ================================
    // Function: Print ArrayList
    // ================================
    public static void printArrayList(ArrayList<Integer> a1) {

        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();
    }

    // ================================
    // Function: Input ArrayList
    // ================================
    public static void inputArrayList(ArrayList<Integer> a1, int n) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            a1.add(sc.nextInt());
        }

        System.out.println("Input ArrayList:");
        printArrayList(a1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of ArrayList:");
        int n = sc.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.println("Enter elements:");
        inputArrayList(a1, n);

        // Remove primes
        removePrimeFromArrayList(a1);

        sc.close();
    }
}