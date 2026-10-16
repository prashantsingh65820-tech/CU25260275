class Factorial {
    static int totalCalls = 0;

    void factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        totalCalls++;

        System.out.println("Factorial = " + result);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.factorial(5);

        System.out.println("Total Calls = " + totalCalls);
    }
}