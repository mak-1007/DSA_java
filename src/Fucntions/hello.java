package Fucntions;
public class hello {
    public static void main(String[] args) {
        System.out.println("helloAmaan");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int a = 0;
        
        while (a < 4) {
            int b = 0;
            while (b < a) {
                System.out.print("*");
                b++;
            }
            System.out.println("");
            a++;
        }
    }
}
