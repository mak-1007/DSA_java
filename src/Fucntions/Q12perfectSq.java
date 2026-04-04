package Fucntions;

import java.util.Scanner;
public class Q12perfectSq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=sc.nextInt();
        for(int i=1; i*i <= n ; i++ ){
            System.out.println(i*i);
        }
    }
    
}
