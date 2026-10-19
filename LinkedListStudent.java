import java.util.LinkedList;

class LinkedListStudent {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.addLast("Rahul");
        students.addLast("Aman");
        students.addLast("Neha");

        students.addFirst("Priya");

        System.out.println("Queue: " + students);

        System.out.println("Removed First: " + students.removeFirst());
        System.out.println("Removed Last: " + students.removeLast());

        System.out.println("Final Queue: " + students);
    }
}