public class VisitorCounter {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Initial visitors = " + visitors);

        System.out.println("Entering visitor: " + (++visitors));
        System.out.println("After entering = " + visitors);

        System.out.println("Leaving visitor: " + (visitors--));
        System.out.println("After leaving = " + visitors);
    }
}