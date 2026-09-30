import java.util.Scanner;

class CopyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements
        for (int i = 0; i < 5; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nCopied array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}