class MatrixAdditionAndSubtraction {
    int[][] matrix = new int[2][2];

    static String matrixType = "2x2 Matrix";

    void addAndSubtract(MatrixAdditionAndSubtraction b) {
        int[][] addition = new int[2][2];
        int[][] subtraction = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                addition[i][j] = matrix[i][j] + b.matrix[i][j];
                subtraction[i][j] = matrix[i][j] - b.matrix[i][j];
            }
        }

        System.out.println("Matrix Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(addition[i][j] + " ");
            System.out.println();
        }

        System.out.println("Matrix Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(subtraction[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixAdditionAndSubtraction a = new MatrixAdditionAndSubtraction();
        MatrixAdditionAndSubtraction b = new MatrixAdditionAndSubtraction();

        a.matrix = new int[][]{{1, 2}, {3, 4}};
        b.matrix = new int[][]{{5, 6}, {7, 8}};

        a.addAndSubtract(b);
    }
}