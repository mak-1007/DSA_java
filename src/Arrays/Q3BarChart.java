package Arrays;

import java.util.Scanner;

public class Q3BarChart {

    public static void PrintBarChart(int []arr , int n, int max){


        for(int i = max ; i>0; i--){
            for(int j=0; j<n ; j++){
                if (arr[j]>=i){
                    System.out.print("\t*");
                }
                else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }

    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //input the number of candles
        System.out.println("enter the number of bar candle for the Bar chart ");
        int n = sc.nextInt();

        // initialize array
        int [] arr = new int[n];

        // take input in array
        for(int i =0; i<arr.length;i++) {
            int index = i+1;
            System.out.println("enter the length of candle : " + index);
            arr[i] = sc.nextInt();
        }

        //find max
        int max = arr[0];
        for(int i=0; i<n; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        PrintBarChart(arr,n,max);
    }
}
