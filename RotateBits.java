import java.util.Scanner;

public class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = (n << 2) | (n >>> 30);

        System.out.println("After left rotation by 2 bits = " + result);
    }
}