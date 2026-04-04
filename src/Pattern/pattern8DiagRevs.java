package Pattern;

import java.util.Scanner;

public class pattern8DiagRevs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number Of Rows ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();

        }



         System.out.println(" Second  method ");

            for (int i = 1; i <= n; i++) {
                for (int j = 1 ; j<= n; j++) {
                    if (i+j == n+1) {
                        System.out.print("*\t");
                    } 
                    else {
                        System.out.print("\t");
                    }
                    
                }System.out.println();
            }

    }

}
