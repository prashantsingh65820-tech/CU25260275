import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

class HospitalPatientAgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Patient age must be between 0 and 120."
                );
            }

            System.out.println("Patient: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}