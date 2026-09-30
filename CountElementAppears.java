import java.util.Scanner;

class CountElementAppears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        boolean[] visited = new boolean[7];

        System.out.println("Enter 7 elements:");

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency of each element:");

        for (int i = 0; i < 7; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < 7; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}