import java.util.Scanner;

public class LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter range start: ");
        int start = sc.nextInt();

        System.out.print("Enter range end: ");
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end)
            System.out.println("Year is a leap year and within range");
        else
            System.out.println("Condition not satisfied");
    }
}