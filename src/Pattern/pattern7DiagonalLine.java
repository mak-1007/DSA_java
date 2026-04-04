package Pattern;

import java.util.Scanner;

public class pattern7DiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number Of Rows ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println(" other method ");

        for (int i=1; i<=n ; i++){
            for (int j=1; j<=n; j++){
                if (i==j) {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }System.out.println();
        }

    }

}
