import java.util.Scanner;

public class shiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("n * 2 = " + (n << 1));
        System.out.println("n * 4 = " + (n << 2));
        System.out.println("n / 2 = " + (n >> 1));
        System.out.println("n / 4 = " + (n >> 2));
    }
}