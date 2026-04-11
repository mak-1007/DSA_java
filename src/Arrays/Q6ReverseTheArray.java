package Arrays;

import java.util.Scanner;

public class Q6ReverseTheArray {

    public static void ReverseTheArray(int[] arr, int n){
        int i=arr.length-1;
        int j=0;

        while(i > j){

           int temp;
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
            i--;
            j++;
        }
        for (int k = 0; k < n; k++) {
            System.out.print("\t"+arr[k]);
        }

    }
//    public static void ReverseTheArray(int []arr, int n){
//        int[]reverseArray=new int[n];
//
//        int i=arr.length-1;
//        int j = 0;
//        while(i>=0){
//            reverseArray[j]=arr[i];
//            i--;
//            j++;
//        }
//        PrintArray(reverseArray,n);
//    }

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
            System.out.print("\t"+arr[i]);
        }
        System.out.println();
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array  : ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Array 1 :");
        GiveInputToArray(arr, n);
        PrintArray(arr,n);
        ReverseTheArray(arr,n);

    }
}
