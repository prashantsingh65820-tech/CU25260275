import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }

        System.out.println("Number of set bits = " + count);
    }
}