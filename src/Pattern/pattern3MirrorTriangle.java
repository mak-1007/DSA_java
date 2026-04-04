package Pattern;
import java.util.Scanner;

public class pattern3MirrorTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=sc.nextInt();
        for (int i=0; i<n ;  i++){
            for(int k=0; k<n-i ; k++){
                System.out.print("  ");
            }
            for ( int j=n-i; j<n; j++){
                System.out.print("* ");
            }System.out.println("");
        }


         System.out.println("pattern with  tab space ");
        int sp=n-1;
        int st=1;
        for(int i=1 ; i<=n;  i++){
         
            // System.out.print(sp+", " + st );
         for(int k =0 ; k<sp; k++){
            System.out.print("\t");
         }
         for(int j=0; j<st;j++){
            System.out.print("*\t");
         }
            sp--;
            st++;
            System.out.println();
        }








        
    }
    
}
