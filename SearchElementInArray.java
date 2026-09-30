import java.util.Scanner;

class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] == search) {
                    System.out.println("Element found at row "
                            + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}