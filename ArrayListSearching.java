import java.util.ArrayList;
import java.util.Scanner;

class ArrayListSearching {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("AI");
        courses.add("Web Development");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course exists.");
        } else {
            System.out.println("Course not found.");
        }

        sc.close();
    }
}