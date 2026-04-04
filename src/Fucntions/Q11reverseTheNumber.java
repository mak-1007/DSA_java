package Fucntions;

import java.util.Scanner;

public class Q11reverseTheNumber {

    public static void main(String[] args) {
        System.out.println("enter the number  input");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        while(n > 0){

            int r =n%10;
            n=n/10;
            System.out.print(r);
        }

    }
}
