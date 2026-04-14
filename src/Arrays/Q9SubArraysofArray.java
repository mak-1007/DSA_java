package Arrays;

import java.util.Scanner;

public class Q9SubArraysofArray {

    public static void SubArraysofArray(int [] arr,int n){

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("\t"+arr[j]);
            }
            System.out.println("");
        }

    }

    public static  void  giveArrayValue(int [] arr, int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("enter the vslue of the the index "+i+" of the array");
            arr[i]=sc.nextInt();
        }
        printArray(arr,n);
    }
    public static void printArray(int [] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the Array: ");
        int n=sc.nextInt();

            int [] arr= new int[n];
            System.out.println("the given array");
            giveArrayValue(arr,n);
            System.out.println("sub arrays of the array ");
            SubArraysofArray(arr,n);
    }
}
