import java.util.TreeSet;

class StudentId {
    public static void main(String[] args) {

        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(105);
        ids.add(101);
        ids.add(103);
        ids.add(101);
        ids.add(108);
        ids.add(106);

        System.out.println("Student IDs: " + ids);

        System.out.println("First ID: " + ids.first());
        System.out.println("Last ID: " + ids.last());
        System.out.println("Higher than 103: " + ids.higher(103));
        System.out.println("Lower than 103: " + ids.lower(103));
    }
}