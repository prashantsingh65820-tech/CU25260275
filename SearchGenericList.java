import java.util.ArrayList;
import java.util.Scanner;

class SearchGenericList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }

        System.out.print("Enter number to search: ");
        int n = sc.nextInt();

        if (numbers.contains(n)) {
            System.out.println("Number exists.");
        } else {
            System.out.println("Number does not exist.");
        }
    }
}