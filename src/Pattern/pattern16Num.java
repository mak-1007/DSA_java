package Pattern;

import java.util.Scanner;

public class pattern16Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int n = sc.nextInt();
        int sp = 2*n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) { // rows
            int val =1;
            for (int j = 1; j <= st; j++) { //star
                System.out.print(val+"\t");
                val++;
            }
            for (int k = 1; k <=sp ; k++) {
                System.out.print("\t");
            }
            if(i==n){
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                // System.out.print(val+"");
                val--;
                System.out.print(val+"\t");
            }
            System.out.println();
            st++;
            sp -= 2;
        }

    }
}