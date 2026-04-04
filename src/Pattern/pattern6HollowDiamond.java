package Pattern;

import java.util.Scanner;

public class pattern6HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows");
        int n = sc.nextInt();
        int sp = 1;
        int st = n/2 +1;
        for (int i =1; i <= n; i++) {

            for (int j=1; j <= st; j++)
            {
                System.out.print("*\t");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++)
            {
                System.out.print("*\t");
            }
            
            if (i <= n/2) {
                st --;
                sp +=2;
                
            } else {
                st ++;
                sp -=2 ;
                
            }
            System.out.println();
        }
        
    }

}
