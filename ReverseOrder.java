import java.util.Scanner;

class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}