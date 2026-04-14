package Arrays;

import java.util.Scanner;

public class Q10SubsetsOfArray {

    // Function to print all subsets of array
    public static void SubsetsOfArray(int arr[], int n) {

        // Total subsets = 2^n
        int limit = (int) Math.pow(2, n);

        // Loop through all numbers from 0 to 2^n - 1
        for (int i = 0; i < limit; i++) {

            String set = "";
            int temp = i;

            // Convert number to binary and map with array
            for (int j = n - 1; j >= 0; j--) {

                int r = temp % 2;   // extract last binary bit
                temp = temp / 2;

                // If bit is 0 → do not include element
                if (r == 0) {
                    set = "_\t" + set;
                }
                // If bit is 1 → include element
                else {
                    set = arr[j] + "\t" + set;
                }
            }

            // Print one subset
            System.out.println(set);
        }
    }

    // Function to take input
    public static void giveArrayValue(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value of index " + i + " of the array");
            arr[i] = sc.nextInt();
        }

        // Print entered array
        printArray(arr, n);
    }

    // Function to print array
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array:");
        giveArrayValue(arr, n);

        System.out.println("Subsets of the array:");
        SubsetsOfArray(arr, n);
    }
}