package Arrays;

import java.util.Scanner;

public class Q1CalculateSpanOfArray {

    public static void Print(int [] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println("the value of the index "+i+" is "+arr[i]);
        }
    }
    public static void CalcSpan(int []arr ){
        int span=0;
        int max=arr[0];
        int min=arr[1];

        for(int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        span = max-min;
        System.out.println("the span of the arr is "+span);
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr = new int[n];

        for(int i =0; i<arr.length;i++) {
            System.out.println("enter the value of the array index " + i);
            arr[i] = sc.nextInt();
        }
            Print(arr);
            CalcSpan(arr);




    }
}
