package Fucntions;

public class Q17MultiplicationOfAnyBase {

    // 🔹 This function multiplies a number with ONE digit in given base
    public static int multiplyWithOneDigit(int num, int multiplier, int base) {

        int lastDigit = 0;   // stores last digit of num
        int carry = 0;       // carry generated during multiplication
        int result = 0;      // final result of this step
        int power = 1;       // place value (1, 10, 100...)

        // Loop until number is finished AND no carry remains
        while (num != 0 || carry > 0) {

            // Extract last digit of num
            lastDigit = num % 10;

            // Remove last digit from num
            num = num / 10;

            // Multiply digit with multiplier + carry
            int value = lastDigit * multiplier + carry;

            // Calculate new carry based on base
            carry = value / base;

            // Remainder becomes current digit
            value = value % base;

            // Add this digit to result at correct place
            result = result + value * power;

            // Move to next place (tens → hundreds)
            power = power * 10;
        }

        return result;
    }

    // 🔹 Main multiplication logic (like school multiplication)
    public static int multiplication(int num, int multiplyingNum, int base) {

        int power = 1;   // used to shift left (like ×10, ×100)
        int result = 0;  // final result

        // Loop through each digit of multiplyingNum
        while (multiplyingNum != 0) {

            // Get last digit of second number
            int lastDigit = multiplyingNum % 10;

            // Remove last digit
            multiplyingNum = multiplyingNum / 10;

            // Multiply num with this single digit
            int singleDigitProduct = multiplyWithOneDigit(num, lastDigit, base);

            // Add to result (with proper shift)
            result = getSum(result, singleDigitProduct * power, base);

            // Increase place (shift left)
            power = power * 10;
        }

        return result;
    }

    // 🔹 Adds two numbers in ANY base
    public static int getSum(int result, int singleProduct, int base) {

        int rv = 0;      // final result
        int c = 0;       // carry
        int power = 1;   // place value

        // Loop until both numbers and carry are finished
        while (result > 0 || singleProduct > 0 || c > 0) {

            // Extract last digits of both numbers
            int last_d1 = result % 10;
            int last_d2 = singleProduct % 10;

            // Remove last digits
            result = result / 10;
            singleProduct = singleProduct / 10;

            // Add digits + carry
            int sum = last_d1 + last_d2 + c;

            // Update carry based on base
            c = sum / base;

            // Keep remainder as digit
            sum = sum % base;

            // Add to final result
            rv = rv + sum * power;

            // Move to next place
            power = power * 10;
        }

        return rv;
    }

    public static void main(String[] args) {

        int base = 8;   // Base = 8 (Octal system)

        int num1 = 236; // Number in base-8
        int num2 = 74;  // Number in base-8

        // Perform multiplication
        int product = multiplication(num1, num2, base);

        // Print final result
        System.out.println("Product of " + num1 + " and " + num2 + " in base " + base + " = " + product);
    }
}