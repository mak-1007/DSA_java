package Fucntions;

import java.util.Scanner;

public class Q2printPrimeUpto {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower range  :");
        int low = sc.nextInt();
        System.out.print("enter the higher range  :");
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {
            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n+" s prime ");
            }

        }

    }

}
