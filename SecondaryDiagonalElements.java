import java.util.Scanner;

class SecondaryDiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < 3; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}