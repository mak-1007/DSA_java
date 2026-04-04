package Pattern;

import java.util.Scanner;

public class pattern14MulTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value  x to print the table ");
        int  n = sc.nextInt();

        for (int i =1; i <= 10; i++){
            int x=n*i;
            System.out.println(n+" * "+i+" = "+x);
        }
        // System.out.println();

    }
    
}
