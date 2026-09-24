import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Amount = " + amount);
    }
}