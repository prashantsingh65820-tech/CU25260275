import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorExample {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Database");

        ListIterator<String> iterator = subjects.listIterator();

        while (iterator.hasNext()) {

            String subject = iterator.next();

            if (subject.equals("Python")) {
                iterator.set("AI");
                iterator.add("Machine Learning");
            }
        }

        System.out.println("Modified List:");

        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}