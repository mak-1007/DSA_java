package Pattern;

import java.util.Scanner;

public class pattern11NumTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number Of Rows ");
        int n = sc.nextInt();
        int count=1;
        for (int i=1; i<n ; i++){
            for (int j=0; j<i; j++){
                System.out.print(count+"\t");
                count++;
            }System.out.println();
        }
    }
    
}
