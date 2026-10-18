import java.util.ArrayList;

class GenericStringList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Neha");
        students.add("Priya");
        students.add("Rohit");

        System.out.println("List: " + students);
        System.out.println("Get: " + students.get(1));

        students.set(1, "Arjun");
        System.out.println("After set: " + students);

        students.remove("Neha");
        System.out.println("After remove: " + students);

        System.out.println("Size: " + students.size());
    }
}