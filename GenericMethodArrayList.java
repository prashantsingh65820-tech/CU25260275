import java.util.ArrayList;

class GenericMethodArrayList {
    static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Aman");
        names.add("Neha");

        System.out.println("Integer List:");
        display(numbers);

        System.out.println("String List:");
        display(names);
    }
}