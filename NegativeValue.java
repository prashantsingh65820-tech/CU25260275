import java.util.Scanner;

public class NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Negative value = " + (-n));
    }
}