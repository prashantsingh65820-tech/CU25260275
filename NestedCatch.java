import java.util.Scanner;

class NestedCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            try {
                int[] arr = {10, 20, 30};

                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                System.out.println("Element: " + arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }

            System.out.println("Division: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}