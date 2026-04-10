package Arrays;

import java.util.Scanner;

public class Q2FindElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<arr.length;i++) {
            System.out.println("enter the value of the array index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to find in Array");
        int ele=sc.nextInt();
        int idx = - 1;
        for(int i=0; i<n;i++){
            if (arr[i] == ele){
               idx = i;
            }
        }
        if (idx == -1){
            System.out.println("element does not exists");
        }
        else{
            System.out.println("the eleme " + ele + "index number is "+ idx);
        }
    }
}
