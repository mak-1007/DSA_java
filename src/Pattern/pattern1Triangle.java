package Pattern;

import java.util.Scanner;

public class pattern1Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=sc.nextInt();
        for (int i=0; i< n ;  i++){
            for ( int j=0; j<i; j++){
                System.out.print("* ");
            }System.out.println("");
        }
        System.out.println("pattern with  tab space ");
        for (int i=0; i< n ;  i++){
            for ( int j=0; j<i; j++){
                System.out.print("*\t");
            }System.out.println("");
        }
    }
    
}
