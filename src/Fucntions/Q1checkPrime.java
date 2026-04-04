package Fucntions;
import java.util.Scanner;

public class Q1checkPrime {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking how many numbers the user wants to check
        System.out.println("enter the number of times you want to input");
        int n = sc.nextInt();

        // Loop runs 'n' times to check 'n' numbers
        for (int i = 0; i < n; i++) {

            // Taking the number to check whether it is prime
            System.out.println("enter the input to check prime : ");
            int p = sc.nextInt();

            // count is used as a flag:
            // count = 0 → assume number is prime
            // count > 0 → number is not prime
            int count = 0;

            // Checking divisibility from 2 to √p
            // If p has any divisor in this range, it is NOT prime
            // if a no. is not prime then it must be divisible by its square root either integer or fractinal form
            for (int div = 2; div * div <= p; div++) {

                // If p is divisible by div
                if (p % div == 0) {
                    count++;   // divisor found
                    break;     // no need to check further
                }
            }

            // If no divisor was found
            if (count == 0) {
                System.out.println("prime");
            } 
            // If at least one divisor was found
            else {
                System.out.println("not Prime");
            }
        }
    
    
    }
}
