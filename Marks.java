import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks of Subject 2: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks of Subject 3: ");
        float m3 = sc.nextFloat();

        float total = m1 + m2 + m3;
        float percentage = total / 3;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}