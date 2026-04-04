package Pattern;

import java.util.Scanner;

public class pattern10HollowDiamont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number Of Rows ");
        int n = sc.nextInt();
        int isp = -1;
        int osp = n / 2;

        for (int i = 1; i <= n; i++) { // rows

            for (int k = 1; k <= osp; k++) { // outer spaces
                System.out.print("\t");
            }
            System.out.print("*\t"); //print star

            for (int k = 1; k <= isp; k++) {
                System.out.print("\t");
            }
            if (i>1 && i< n){ // condtional star
                System.out.print("*\t");
            }            

            if (i <= n / 2) {
                isp += 2;
                osp--;
            } else {
                isp -= 2;
                osp++;
            } 
            System.out.println();

        }
    }

}
