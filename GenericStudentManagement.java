import java.util.ArrayList;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Marks: " + marks
        );
    }

    T getId() {
        return id;
    }
}

class GenericStudentManagement {
    public static void main(String[] args) {

        ArrayList<Student<Integer, String, Double>> students =
            new ArrayList<>();

        students.add(new Student<>(101, "Rahul", 85.5));
        students.add(new Student<>(102, "Aman", 78.0));
        students.add(new Student<>(103, "Neha", 92.5));
        students.add(new Student<>(104, "Rohit", 88.0));
        students.add(new Student<>(105, "Priya", 95.0));

        System.out.println("All Students:");

        for (Student<Integer, String, Double> s : students) {
            s.display();
        }

        System.out.println("\nTotal Students: " + students.size());

        int searchId = 103;
        boolean found = false;

        for (Student<Integer, String, Double> s : students) {
            if (s.getId().equals(searchId)) {
                System.out.println("Student with ID " +
                                   searchId + " found.");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.println(
            "Contains first student: " + students.contains(students.get(0))
        );

       
    }
}