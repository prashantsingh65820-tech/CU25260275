import java.util.Scanner;

class UsingThrows {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkAge(age);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}