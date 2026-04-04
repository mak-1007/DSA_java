package Fucntions;

import java.util.Scanner;

public class Q10primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int div=2;
        // check prime
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
                i--;
            }

        }

        

    }

}



// while (n!= 1) {
//             if (n%div == 0) {
//                 System.out.print(div+" ");
//                 n=n/div;
//             }
//             else{
//                 div++;
//             }
//         }