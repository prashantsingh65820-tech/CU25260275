import java.util.HashSet;

class UniqueDepartments {
    public static void main(String[] args) {

        HashSet<String> departments = new HashSet<>();

        departments.add("CSE");
        departments.add("BCA");
        departments.add("ECE");
        departments.add("CSE");
        departments.add("BBA");
        departments.add("BCA");

        System.out.println("Unique Departments:");

        for (String dept : departments) {
            System.out.println(dept);
        }
    }
}