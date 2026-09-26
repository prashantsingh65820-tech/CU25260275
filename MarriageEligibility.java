import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next();

        if (gender.equalsIgnoreCase("male")) {
            if (age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else if (gender.equalsIgnoreCase("female")) {
            if (age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else {
            System.out.println("Invalid gender");
        }
    }
}