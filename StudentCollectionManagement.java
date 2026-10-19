import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Scanner;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class StudentCollectionManagement  {

    static ArrayList<Student> students = new ArrayList<>();
    static HashSet<Integer> uniqueIds = new HashSet<>();
    static TreeSet<Integer> sortedIds = new TreeSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Collection Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward/Backward Iteration");
            System.out.println("7. Display List, Set and SortedSet");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    if (uniqueIds.contains(id)) {
                        System.out.println("Student ID already exists.");
                    } else {

                        System.out.print("Enter Student Name: ");
                        String name = sc.next();

                        students.add(new Student(id, name));
                        uniqueIds.add(id);
                        sortedIds.add(id);

                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == removeId) {
                            students.remove(i);
                            uniqueIds.remove(removeId);
                            sortedIds.remove(removeId);

                            removed = true;
                            System.out.println("Student removed.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.id == searchId) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nStudent Records:");

                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 6:

                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                        break;
                    }

                    ListIterator<Student> iterator =
                            students.listIterator();

                    System.out.println("\nForward Traversal:");

                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    System.out.println("\nBackward Traversal:");

                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case 7:

                    System.out.println("\nArrayList (List):");
                    System.out.println(students);

                    System.out.println("\nHashSet (Set - Unique IDs):");
                    System.out.println(uniqueIds);

                    System.out.println("\nTreeSet (SortedSet - Sorted IDs):");
                    System.out.println(sortedIds);

                    System.out.println("\nDifference:");
                    System.out.println("List maintains insertion order and allows duplicates.");
                    System.out.println("Set stores unique elements.");
                    System.out.println("SortedSet stores unique elements in sorted order.");
                    break;

                case 8:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}