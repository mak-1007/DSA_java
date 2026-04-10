package Arrays;

import java.util.Scanner;

//  Assume arr1 represents a bigger number than arr2
public class Q5DifferenceOfTwoArrays {

    // 🔹 Function to subtract two arrays
    public static void DifferenceOfTwoArrays(int[] arr1, int[] arr2, int n1, int n2) {

        // Result array size = max of both
        int[] diffArray = new int[n1 > n2 ? n1 : n2];

        // Start from last index (right to left subtraction)
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diffArray.length - 1;

        int borrow = 0;

        // Loop till all digits are processed
        while (k >= 0) {

            // Take value from arr1
            int a1value = i >= 0 ? arr1[i] : 0;

            // Take value from arr2 (IMPORTANT FIX)
            int a2value = j >= 0 ? arr2[j] : 0;

            int diff;

            // If subtraction possible without borrow
            if (a1value + borrow >= a2value) {
                diff = a1value + borrow - a2value;
                borrow = 0; // reset borrow
            }
            // Need borrow
            else {
                diff = a1value + borrow + 10 - a2value;
                borrow = -1;
            }

            // Store result
            diffArray[k] = diff;

            // Move pointers
            i--;
            j--;
            k--;
        }

        //  Remove leading zeros
        int idx = 0;
        while (idx < diffArray.length && diffArray[idx] == 0) {
            idx++;
        }

        //  Print result
        System.out.println("the result is  : ");
        while (idx < diffArray.length) {
            System.out.print(diffArray[idx]);
            idx++;
        }

//        // Edge case: if result is 0
//        if (idx == diffArray.length) {
//            System.out.print(0);
//        }
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

        //  Call subtraction function
        DifferenceOfTwoArrays(arr1, arr2, n1, n2);
    }
}