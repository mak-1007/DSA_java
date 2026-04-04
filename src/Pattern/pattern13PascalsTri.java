package Pattern;

import java.util.Scanner;

public class pattern13PascalsTri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh number Of Rows ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int icj=1;
            for (int j = 0; j <= i; j++) {
                
                System.out.print(icj+"\t");

                int icj_1= (icj*(i-j)) / (j+1);
                
                   icj=icj_1; 
            }
            System.out.println();
        }

    }

}
