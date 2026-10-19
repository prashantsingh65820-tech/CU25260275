import java.util.ArrayList;
import java.util.Collections;

class CollectionUnity {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Frequency of 2: " +
                           Collections.frequency(numbers, 2));
    }
}