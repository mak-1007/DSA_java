package Pattern;

import java.util.Scanner;

public class pattern12FibonacciTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh number Of Rows ");
        int n = sc.nextInt();

        int f = 0;
        int s = 1;
        // System.out.print(f+"\t");
        // System.out.print(s+"\t");
        for(int i=1 ; i<n; i++){
            for(int j=0 ;j<i; j++){
                System.out.print(f+"\t");
                int th= f+s;
                f=s;
                s=th;

            }System.out.println();
        }

    }

}
