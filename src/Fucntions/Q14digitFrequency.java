package Fucntions;

import java.util.Scanner;

public class Q14digitFrequency {
    public static int DigitFrequency(int n,int d)
    {
        int remainder =0;
        int count =0;
        while(n!=0){
            remainder = n%10;
            n=n/10;
            if (remainder == d){
                count++;
            }
        }
    return count;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number n :");
        int n =sc.nextInt();
        System.out.println("enter the digit to check its frequency");
        int d=sc.nextInt();
        int frequency = DigitFrequency(n,d);
        if (frequency==0){
            System.out.println("the digit is not in the  umber ");
        }
        else {
            System.out.println("the digit Frequency is : "+frequency);
        }

    }
}
