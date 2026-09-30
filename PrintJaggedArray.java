import java.util.Scanner;

class PrintJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of elements in row "
                    + (i + 1) + ": ");

            int n = sc.nextInt();
            arr[i] = new int[n];

            System.out.println("Enter elements:");

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sort each row using bubble sort
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < arr[i].length - 1; j++) {

                for (int k = 0; k < arr[i].length - j - 1; k++) {

                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array after sorting each row:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}