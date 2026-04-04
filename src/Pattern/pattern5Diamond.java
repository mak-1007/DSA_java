package Pattern;

import java.util.Scanner;

public class pattern5Diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ehter the number of rows");
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        for (int i=0;i<n; i++){ // rows

            for(int k=1; k<=sp; k++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                sp--;
                st +=2;
            }
            else{
                sp++;
                st -=2;
            }
            System.out.println();
        }

    }
    
}
