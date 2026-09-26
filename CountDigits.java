import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digits;

        if (n >= -9 && n <= 9)
            digits = 1;
        else if (n >= -99 && n <= 99)
            digits = 2;
        else if (n >= -999 && n <= 999)
            digits = 3;
        else if (n >= -9999 && n <= 9999)
            digits = 4;
        else
            digits = 5;

        System.out.println("Number of digits = " + digits);
    }
}