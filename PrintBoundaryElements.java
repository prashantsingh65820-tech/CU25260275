import java.util.Scanner;

class PrintBoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[4][4];

        System.out.println("Enter 16 elements:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == 0 || i == 3 || j == 0 || j == 3)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}