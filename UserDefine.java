import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class UserDefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid marks: " + marks);
        }
        catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}