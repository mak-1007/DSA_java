package Fucntions;

import java.util.Scanner;

public class Q7inverseTheNum {
    public static void main(String[] args) {
        // i_v inverted digit
        // i_p inverted place
        // c_v original digit 
        // c_p original place
        System.out.println("enter the number  input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c_p=1;
        int inv=0;
        int i_p,i_v,c_v;
        while (n!=0) {
            c_v=n%10;
            i_v=c_p;
            i_p=c_v;
            inv=inv+ i_v * (int) Math.pow(10,i_p-1);
            n=n/10;
            c_p++;
        }
        System.out.println(inv);
  
    }

}