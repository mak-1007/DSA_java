package Arrays;

import java.util.Scanner;

public class Q14RemovePrimeNumFromArray {

    // ================================
    // Function: Check if number is prime
    // ================================
    public static boolean isPrime(int n) {

        // 0 and 1 are not prime
        if (n <= 1) return false;

        // Check divisibility till √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // divisor found
            }
        }

        return true; // no divisor → prime
    }

    // ================================
    // Function: Remove prime numbers
    // ================================
    public static void removePrimeNumFromArray(int[] arr) {

        int count = 0;

        // Step 1: Count NON-prime elements
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                count++;   // (increment, not decrement)
            }
        }

        // Step 2: Create new array of required size
        int[] newArr = new int[count];

        int j = 0;

        // Step 3: Store only non-prime elements
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("After Removing Prime Numbers:");
        printArray(newArr);
    }

    // ================================
    // Input function
    // ================================
    public static void inputArrayElements(int[] arr) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input array:");
        printArray(arr);
    }

    // ================================
    // Print function
    // ================================
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        inputArrayElements(arr);

        // Call function
        removePrimeNumFromArray(arr);

        sc.close();
    }
}