package Fucntions;

import java.util.Scanner;
public class Q13nPr {

    public static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n; i++){
            fact*=i;
        }
        return fact;
    }
public static void display (float n){
    System.out.println(n);
}

    public static void main (String args []){
        System.out.println("enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter th evalue of r :");
        int r=sc.nextInt();


//        calculate the n factoril
        int n_fact =factorial(n);;
        System.out.println("the n factorial is :"+n_fact);

//        calculate the n-r factorial
        int n_r_fact = factorial(n-r);

        System.out.println("the n-r factorial is :"+n_r_fact);
        float npr = n_fact / n_r_fact;
        System.out.println("the final value is : "+npr);

    }
}
