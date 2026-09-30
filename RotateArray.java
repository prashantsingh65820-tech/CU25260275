import java.util.Scanner;

class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for (int i = 0; i < 4; i++) {
            arr[i] = arr[i + 1];
        }

        arr[4] = first;

        System.out.println("Array after left rotation:");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}