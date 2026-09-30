import java.util.Scanner;

class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int[] result = new int[7];
        int size = 0;

        System.out.println("Enter 7 elements:");

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {

            boolean duplicate = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}