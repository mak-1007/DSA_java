package Arrays;

import java.util.Scanner;

public class Q11BinarySearchOnArray {

    // Function to perform Binary Search
    public static void BinarySearchOnArray(int[] arr, int ele) {
        int low =0;
        int high =arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ele>arr[mid]){
                low = mid +1;

            } else if(ele<arr[mid]) {
                high=mid-1;
            }
            else {
                System.out.println("index : "+mid);
                return;
            }
        }
        System.out.println("not found");
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
        System.out.println("Your array:");
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

        System.out.println("Enter array (sorted order required):");
        giveArrayValue(arr, n);

        System.out.println("enter the element to be searched: ");
        int ele = sc.nextInt();

        BinarySearchOnArray(arr, ele);
    }
}