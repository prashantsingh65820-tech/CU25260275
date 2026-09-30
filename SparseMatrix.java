import java.util.Scanner;

class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        int zero = 0;
        int nonZero = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonZero);

        if (zero > nonZero)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }
}