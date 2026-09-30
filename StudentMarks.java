import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][];

        // Input number of subjects for each student
        for (int i = 0; i < students; i++) {
            System.out.print("Enter number of subjects for Student "
                    + (i + 1) + ": ");
            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // Display marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}