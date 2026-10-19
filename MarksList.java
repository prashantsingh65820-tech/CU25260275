import java.util.ArrayList;

class MarksList {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(88);
        marks.add(75);

        System.out.println("First Mark: " + marks.get(0));
        System.out.println("Middle Mark: " + marks.get(2));
        System.out.println("Last Mark: " + marks.get(4));
    }
}