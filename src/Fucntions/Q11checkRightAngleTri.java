package Fucntions;

import java.util.Scanner;

public class Q11checkRightAngleTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value c : ");
        int c = sc.nextInt();

        // max
        int max = a;
        if (b > max) {
            max = b;

        }
        if (c > max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c == a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a + c * c == b * b));
            System.out.println(flag);

        }
        if (max == c) {
            boolean flag = ((b * b + a * a == c * c));
            System.out.println(flag);

        }

    }

}
