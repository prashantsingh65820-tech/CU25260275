import java.util.Scanner;
class NumberException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        try {
            int n = Integer.parseInt(number);
            System.out.println("Integer: " + n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}