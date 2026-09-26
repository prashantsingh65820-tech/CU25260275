import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        int digit1 = n % 10;
        sum = sum + digit1 * digit1 * digit1;
        n = n / 10;

        int digit2 = n % 10;
        sum = sum + digit2 * digit2 * digit2;
        n = n / 10;

        int digit3 = n % 10;
        sum = sum + digit3 * digit3 * digit3;

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}