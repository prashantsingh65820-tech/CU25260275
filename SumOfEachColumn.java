import java.util.Scanner;

class SumOfEachColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}