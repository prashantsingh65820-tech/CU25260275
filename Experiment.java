import java.util.ArrayList;
import java.util.HashSet;

class Experiment {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);

        System.out.println("\nDifference:");
        System.out.println("ArrayList allows duplicates.");
        System.out.println("HashSet removes duplicates.");
        System.out.println("ArrayList maintains insertion order.");
        System.out.println("HashSet does not guarantee order.");
    }
}