import java.util.ArrayList;

class UpdateStudentName {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Neha");
        students.add("Rohit");
        students.add("Priya");

        students.set(1, "Arjun");
        students.remove(3);

        System.out.println("Updated Student List:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}