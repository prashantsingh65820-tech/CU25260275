import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correct = "java";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correct))
                System.out.println("Incorrect password");

        } while (!password.equals(correct));

        System.out.println("Correct password. Access granted.");
    }
}