package Arrays;

import java.util.Scanner;

public class Basics {

    // 🔹 Function to swap two elements in array
    public static void swap(int[] arr, int index1, int index2) {

        // Temporary variable to store value
        int temp;

        // Store value at index1
        temp = arr[index1];

        // Put value of index2 at index1
        arr[index1] = arr[index2];

        // Put stored value (temp) at index2
        arr[index2] = temp;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        // Creating array of size n
        int[] arr = new int[n];

        // Taking input values for array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value of index " + i + " in arr2 of array");
            arr[i] = sc.nextInt();
        }

        // Printing first two elements (just direct access)
        System.out.println("Printing first two elements (just direct access) "+ arr[0]);
        System.out.println("Printing first two elements (just direct access) "+ arr[1]);

        // Traversing array and printing all elements
        System.out.println("Traversing array and printing all elements through loop");
        for (int i = 0; i < n; i++) {
            System.out.println(" the value of " + i + " is " + arr[i]);
        }

        // 🔥 IMPORTANT CONCEPT: Reference Copy (NOT new array)
        int[] arr2 = arr;

        // Changing value in arr2
        arr2[2] = 1000;

        // Printing arr2
        for (int i = 0; i < n; i++) {
            System.out.println(" the value of " + i + " in arr2 is " + arr2[i]);
        }

        // 🔥 Swap elements at index 0 and 2
        swap(arr, 0, 2);

        // Printing updated arr after swap
        for (int i = 0; i < n; i++) {
            System.out.println(" the value of " + i + " in arr is " + arr[i]);
        }
    }
}