package Pattern;

import java.util.Scanner;

public class pattern17Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int n = sc.nextInt();
        int sp= n/2;
        int st=1;
        for (int i = 1; i <= n; i++) {
            // n/2 spaces for All
           if (i == n/2 + 1){
            for (int j=1; j<= n/2; j++){
                System.out.print("*\t");
               }
            
           }
           else{
            
               for (int j=1; j<= n/2; j++){
                System.out.print("\t");
            }
            }
            //star
            for (int j=1; j<= st; j++){
                System.out.print("*\t");
                }
            for(int j=1;j<= sp; j++){
                System.out.print("\t");
            }
            if(i <= n/2){
                st++;
                sp--;
            }
            else{
                st--;
                sp++;
            }
            System.out.println();
        }
    }

}
