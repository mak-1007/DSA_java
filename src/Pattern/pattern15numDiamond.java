package Pattern;

import java.util.Scanner;

public class pattern15numDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows ");
        int n = sc.nextInt();
        int sp = n / 2;
        int count = 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) { // space
                System.out.print("\t");
            }
            int c = count;
            for (int k = 1; k <= st; k++) { // value

                System.out.print(c + "\t");

                if (k <= st / 2) {
                    c++;

                } else {
                    c--;
                }
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
                count++;
            } else {
                sp++;
                st -= 2;
                count--;
            }

            System.out.println();
        }

    }

}
