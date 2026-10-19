import java.util.ArrayList;

class StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Neha");
        students.add("Rohit");
        students.add("Priya");
        students.add("Karan");
        students.add("Anjali");
        students.add("Vikas");
        students.add("Pooja");
        students.add("Arjun");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}