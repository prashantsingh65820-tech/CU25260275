import java.util.Scanner;

public class HalfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
        System.out.println("Final value = " + n);
    }
}