import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int even = 0, odd = 0;

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}