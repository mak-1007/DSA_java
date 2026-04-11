package Arrays;

import java.util.Scanner;

public class Q8InverseTheArray {
    public static void InverseTheArray(int []arr,int n )
    {
        int val;
        int[] res =new int[n];

        for(int i=0;i<n;i++){
                val = arr[i];
                res[val]=i;
            }
        PrintArray(res,n);
    }

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

        int[] arr = new int[n];

        System.out.println("Enter array:");
        GiveInputToArray(arr, n);

        System.out.println("Original array:");
        PrintArray(arr, n);
        InverseTheArray(arr,n);

    }
}
