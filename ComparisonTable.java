import java.util.ArrayList;
import java.util.LinkedList;

class ComparisonTable {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Database");

        arrayList.add(1, "AI");
        arrayList.remove("Python");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList get(1): " + arrayList.get(1));
        System.out.println("ArrayList size: " + arrayList.size());

        System.out.println("ArrayList Iteration:");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println();

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("Database");

        linkedList.add(1, "AI");
        linkedList.remove("Python");

        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList get(1): " + linkedList.get(1));
        System.out.println("LinkedList size: " + linkedList.size());

        System.out.println("LinkedList Iteration:");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}