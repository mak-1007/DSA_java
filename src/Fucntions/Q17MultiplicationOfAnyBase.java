package Fucntions;

public class Q17MultiplicationOfAnyBase {

    public static int multiplyWithOneDigit(int num, int multiplier, int base) {
        int lastDigit = 0;
        int carry = 0;
        int result = 0;
        int power = 1;

        while (num != 0 || carry > 0) {
            lastDigit = num % 10;
            num = num / 10;

            int value = lastDigit * multiplier + carry;
            carry = value / base;
            value = value % base;

            result = result + value * power;
            power = power * 10;
        }
        return result;
    }

    public static int multiplication(int num, int multiplier, int base) {
        int power = 1;
        int result = 0;

        while (multiplier != 0) {
            int lastDigit = multiplier % 10;   // FIXED
            multiplier = multiplier / 10;      // FIXED

            int singleProduct = multiplyWithOneDigit(num, lastDigit, base);

            result = getSum(result, singleProduct * power, base);
            power = power * 10;
        }
        return result;
    }

    public static int getSum(int result, int singleProduct, int base) {
        int rv = 0;   // result value
        int c = 0;    // carry
        int p = 1;    // place value

        while (result > 0 || singleProduct > 0 || c > 0) {
            int d1 = result % 10;
            int d2 = singleProduct % 10;
            result = result / 10;
            singleProduct = singleProduct / 10;

            int d = d1 + d2 + c;
            c = d / base;
            d = d % base;

            rv += d * p;
            p = p * 10;
        }
        return rv;
    }

    public static void main(String[] args) {
        int base = 8; // try octal multiplication
        int num1 = 236; // base-8 number
        int num2 = 74;  // base-8 number

        int product = multiplication(num1, num2, base);
        System.out.println("Product of " + num1 + " and " + num2 + " in base " + base + " = " + product);
    }
}
