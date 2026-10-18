import java.util.ArrayList;

class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            numbers.add(i * 10);
        }

        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}