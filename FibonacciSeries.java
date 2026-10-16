class FibonacciSeries {
    static int seriesCount = 0;

    void fibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
    }

    public static void main(String[] args) {
        FibonacciSeries f = new FibonacciSeries();

        f.fibonacci(10);

        System.out.println("\nSeries Count = " + seriesCount);
    }
}