import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentRecordFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("student_records.txt")) {

            for (int i = 1; i <= 5; i++) {

                System.out.println("\nEnter details of Student " + i);

                System.out.print("Roll Number: ");
                String roll = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                String marks = sc.nextLine();

                writer.write("Roll Number: " + roll + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Marks: " + marks + "\n");
                writer.write("--------------------\n");
            }

        } catch (IOException e) {
            System.out.println("Error writing records: " + e.getMessage());
            sc.close();
            return;
        }

        System.out.println("\nAll student records saved successfully.");
        System.out.println("\nStudent Records:");

        try (BufferedReader br =
                 new BufferedReader(new FileReader("student_records.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading records: " + e.getMessage());
        }

        sc.close();
    }
}