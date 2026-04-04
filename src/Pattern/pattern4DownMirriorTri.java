package Pattern;

import java.util.Scanner;

public class pattern4DownMirriorTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=sc.nextInt();
        
         for(int i=n; i>0; i--){
            for(int k=n-i; k>0 ; k--){
                System.out.print("\t");
            }
            for(int j=0; j<i; j++){   

                //for(int j=n-i; j<n; j++)
                
                System.out.print("*\t");
            }
            System.out.println("");
        }
        System.out.println("pattern with  tab space ");
        int sp=0;
        int st=n;
        
        for(int x=0 ; x<n ; x++){
            
            for (int y=0; y<sp; y++){
                System.out.print("\t");
            }
            for (int z=0; z<st; z++){
                System.out.print("*\t");
            }
            System.out.println();

            sp++;
            st--;
        }




        
    }
    
}
