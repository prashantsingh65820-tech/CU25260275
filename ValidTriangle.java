import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}