import java.util.Scanner;

public class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check power of 4 using shift operators
        int temp = n;
        int power = 1;
        boolean isPowerOf4 = false;

        while (power <= temp) {
            if (power == temp) {
                isPowerOf4 = true;
                break;
            }
            power = power << 2;
        }

        if (isPowerOf4)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is not a power of 4");

        // Toggle 3rd bit
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {

            if ((n * i) % 6 == 0)
                continue;

            if ((n * i) % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}