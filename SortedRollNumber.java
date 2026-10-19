import java.util.TreeSet;

class SortedRollNumber {
    public static void main(String[] args) {

        TreeSet<Integer> rollNumbers = new TreeSet<>();

        rollNumbers.add(105);
        rollNumbers.add(101);
        rollNumbers.add(110);
        rollNumbers.add(103);
        rollNumbers.add(108);
        rollNumbers.add(102);
        rollNumbers.add(109);
        rollNumbers.add(104);
        rollNumbers.add(107);
        rollNumbers.add(106);

        System.out.println("Sorted Roll Numbers:");

        for (int roll : rollNumbers) {
            System.out.println(roll);
        }
    }
}