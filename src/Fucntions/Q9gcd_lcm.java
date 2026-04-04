package Fucntions;

import java.util.Scanner;

public class Q9gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1 ");
        int n1 = sc.nextInt();
        System.out.println("enter the num2 ");
        int n2 = sc.nextInt();
        int divisor_D = n1;
        int devidor_d = n2;
        while (divisor_D % devidor_d != 0) {
            int r = divisor_D % devidor_d;
            divisor_D = devidor_d;
            devidor_d = r;

        }
        int gcd = devidor_d;
        int lcm = (n1 * n2 )/gcd;
        System.out.println("the GCD IS "+gcd);
        System.out.println("The LCM is "+lcm);

    }

}

// System.out.println("enter the num1 ");
// int n1 = sc.nextInt();
// System.out.println("enter the num2 ");
// int n2 = sc.nextInt();

// int divisor = Math.max(n1, n2);
// int devidor = Math.min(n1, n2);
// int gcd=1;
// int r;
// do {
// r = divisor / devidor;
// if (r == 0) {
// gcd = devidor;
// break;
// } else {
// divisor = devidor;
// devidor = r;
// }
// } while (r != 0);

// System.out.println(gcd);