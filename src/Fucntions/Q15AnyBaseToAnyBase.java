package Fucntions;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class Q15AnyBaseToAnyBase {

    public static int DecimaltoAnyBase(int n, int b){
        int rem =0;
        int result=0;
        int power =1;
        while (n!=0){
                rem = n%b;
                result = result + rem * power;
                power = power * 10;
                n = n / b;
        } 
        return result;
    }
    
    public static int AnyBaseToDecimal(int n, int b){
        int result= 0;
        int power =1;
        int rem =0;
        while (n!=0) {
            rem = n% 10;
            n = n /10;
            result = result+rem * power;
            power = power*b;
        }
        return result;
    }


    public static int AnyToAnyBase(int n, int b1, int b2){
       int r1= AnyBaseToDecimal(n,b1);
       int r2 =DecimaltoAnyBase(r1,b2);
        return r2;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("0. List Menu");
        System.out.println("1. Decimal to Any Base");
        System.out.println("2. Any Base to Decimal");
        System.out.println("3. Any Base to Any Base");
        System.out.println("4. Exit");
        // input
        System.out.println("enter the decimal value n: ");
        int n=sc.nextInt();
        System.out.println("enter the base b1 :");
        int b1 =sc.nextInt();
        boolean flag= true;


        while (flag) {
            System.out.println("enter  you choice ");
            int ch = sc.nextInt();
            
            switch (ch) {
            case 0: System.out.println("0. List Menu");
                    System.out.println("1. Decimal to Any Base");
                    System.out.println("2. Any Base to Decimal");
                    System.out.println("3. Any Base to Any Base");
                    System.out.println("4. Exit");
            
            case 1: System.out.println(DecimaltoAnyBase(n,b1));                
                break;
            case 2: System.out.println(AnyBaseToDecimal(n, b1));
                break;
            case 3: System.out.println("enter the base 2: ");
                    int b2 =sc.nextInt();
                    System.out.println(AnyToAnyBase(n, b1, b2));
                break;
            case 4: System.out.println("EXIT");
                    flag = false;
                break;
            default: System.out.println("IInvalid choice");
                break;
        }
            
            
        }

        

    }
    
}
