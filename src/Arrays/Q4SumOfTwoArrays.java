package Arrays;

import java.util.Scanner;

public class Q4SumOfTwoArrays {

    //  Function to add two arrays (like big numbers)
    public static void SumOfTwoArrays(int[] arr1, int[] arr2, int n1, int n2) {

        // Result array size = max of both
        int[] sumArray = new int[n1 > n2 ? n1 : n2];

        // Pointers from last index (right to left addition)
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sumArray.length - 1;

        int carry = 0;

        // Loop until result array is filled
        while (k >= 0) {

            int sum = carry; // start with carry

            // Add from arr1 if exists
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            // Add from arr2 if exists
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            // Calculate digit and carry
            carry = sum / 10;
            sum = sum % 10;

            // Store digit in result
            sumArray[k] = sum;

            k--;
        }

        // If carry is still left
        if (carry != 0) {
            System.out.print(carry);
        }

        // Print final result
        for (int val : sumArray) {
            System.out.print(val);
        }
    }

    //  Input function
    public static void GiveInputToArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value of index " + i + " of array");
            arr[i] = sc.nextInt();
        }
    }

    //  Print function
    public static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("the value of index " + i + " is " + arr[i]);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array 1 : ");
        int n1 = sc.nextInt();

        System.out.println("enter the size of array 2 : ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Array 1 :");
        GiveInputToArray(arr1, n1);

        System.out.println("Array 2 :");
        GiveInputToArray(arr2, n2);

        System.out.println("Array 1 :");
        PrintArray(arr1, n1);

        System.out.println("Array 2 :");
        PrintArray(arr2, n2);

        // Call addition function
        SumOfTwoArrays(arr1, arr2, n1, n2);
    }
}