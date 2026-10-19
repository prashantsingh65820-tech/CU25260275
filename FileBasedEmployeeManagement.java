import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileBasedEmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("employees.txt");

        try {
            if (!file.exists()) {

                try (FileWriter writer = new FileWriter(file)) {
                    System.out.println("Employee file created.");
                }

            }

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(id + "," + name + "," +
                             department + "," + salary + "\n");
            }

            System.out.println("Employee record saved successfully.");

            System.out.print("\nEnter Employee ID to search: ");
            String searchId = sc.nextLine();

            boolean found = false;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;

                while ((line = br.readLine()) != null) {

                    String[] data = line.split(",", -1);

                    if (data.length == 4 && data[0].equals(searchId)) {
                        System.out.println("\nEmployee Record Found:");
                        System.out.println("Employee ID: " + data[0]);
                        System.out.println("Employee Name: " + data[1]);
                        System.out.println("Department: " + data[2]);
                        System.out.println("Salary: " + data[3]);

                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Employee record not found.");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}