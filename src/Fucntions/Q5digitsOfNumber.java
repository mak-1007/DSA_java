package Fucntions;

import java.util.Scanner;

public class Q5digitsOfNumber {
    public static void main(String[] args) {
        System.out.println("enter the number  input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int t=n;
        while (t != 0) {
            t = t / 10;
            c++;
        }

        int div = (int) Math.pow(10, c - 1);

        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;

        }
        
    }

}
