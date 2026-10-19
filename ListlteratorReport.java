import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorReport {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("AI");
        courses.add("Web Development");

        ListIterator<String> iterator = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (iterator.hasNext()) {
            System.out.println(
                "Index: " + iterator.nextIndex() +
                ", Course: " + iterator.next()
            );
        }

        System.out.println("\nBackward Traversal:");

        while (iterator.hasPrevious()) {
            System.out.println(
                "Index: " + iterator.previousIndex() +
                ", Course: " + iterator.previous()
            );
        }
    }
}