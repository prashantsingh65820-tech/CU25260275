import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        int first = n / 10000;
        int last = n % 10;

        if (first == last)
            System.out.println("First and last digits are same");
        else
            System.out.println("First and last digits are different");
    }
}