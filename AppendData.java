import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class AppendData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Marks: ");
        String marks = sc.nextLine();

        try (FileWriter writer = new FileWriter("students.txt", true)) {
            writer.write("Student Name: " + name + "\n");
            writer.write("Roll Number: " + roll + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("--------------------\n");

            System.out.println("Student record appended successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}