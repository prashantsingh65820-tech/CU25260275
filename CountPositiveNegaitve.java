import java.util.Scanner;

class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];
        int positive = 0;
        int negative = 0;

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();

                    if (arr[i][j][k] > 0) {
                        positive++;
                    } else if (arr[i][j][k] < 0) {
                        negative++;
                    }
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
    }
}