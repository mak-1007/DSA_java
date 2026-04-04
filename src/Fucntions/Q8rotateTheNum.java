package Fucntions;

import java.util.Scanner;

public class Q8rotateTheNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        // count the number
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("n is a " + count + " digits number");

        // now rotate the number with k

        System.out.println("enter the position k ");
        int k = sc.nextInt();
        k = k % count;
       
        if (k < 0) {
            k = k + count;

        }
        
        int div = 1;
        int mul = 1;

        //  n= 12345 so => 123 / 45 for k=2 =>
        for (int i = 1; i <= count; i++) {
            // 10 Pow k
            if (i <= k) {
                div = div * 10;
            }
            // 10 Pow n-k = r
            else {

                mul = mul * 10;
            }

        }
        int q = n / div;
        int r = n % div;
        int rotated_Num = r * mul + q;
        System.out.println(rotated_Num);
    }

}


//         // Step 1: Input the number
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         // Step 2: Count number of digits
//         int temp = n;
//         int count = 0;
//         while (temp != 0) {
//             temp = temp / 10;
//             count++;
//         }

//         System.out.println("n is a " + count + " digits number");

//         // Step 3: Input the rotation count k
//         System.out.print("Enter the position k: ");
//         int k = sc.nextInt();

//         // Step 4: Normalize k
//         k = k % count;
//         if (k < 0) {
//             k = k + count;
//         }

//         // Step 5: Compute div and mul correctly
//         int div = (int) Math.pow(10, k);
//         int mul = (int) Math.pow(10, count - k);

//         // Step 6: Split number and rotate
//         int r = n % div;
//         int q = n / div;

//         int rotatedNum = r * mul + q;

//         // Step 7: Output
//         System.out.println("Rotated number: " + rotatedNum);
//     }
// }
