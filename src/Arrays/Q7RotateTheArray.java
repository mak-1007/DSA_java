package Arrays;

import java.util.Scanner;

public class Q7RotateTheArray {

    // Function to reverse part of array from index i to j
    public static void ReverseTheArray(int[] arr, int i, int j) {

        // Swap elements until i crosses j
        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // Function to rotate array by k positions (right rotation)
    public static void rotateTheArray(int[] arr, int n, int k) {

        // Handle k greater than size
        if (k > n) {
            k = k % n;
        }

        // Handle negative rotation
        if (k < 0) {
            k = k + n;
        }

        // Step 1: reverse first part
        ReverseTheArray(arr, 0, n - k - 1);

        // Step 2: reverse second part
        ReverseTheArray(arr, n - k, n - 1);

        // Step 3: reverse whole array
        ReverseTheArray(arr, 0, n - 1);

        // Print result
        PrintArray(arr, n);
    }

    // Input function
    public static void GiveInputToArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value of index " + i + " of array");
            arr[i] = sc.nextInt();
        }
    }

    // Print function
    public static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:");
        int n = sc.nextInt();

        System.out.println("enter the value to rotate:");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array:");
        GiveInputToArray(arr, n);

        System.out.println("Original array:");
        PrintArray(arr, n);

        rotateTheArray(arr, n, k);
    }
}