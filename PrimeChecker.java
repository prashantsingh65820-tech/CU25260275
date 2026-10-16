class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean prime = true;

        if (number < 2)
            prime = false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is not Prime");
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        p.checkPrime(17);

        System.out.println("Total Prime Checks = " + totalPrimeChecks);
    }
}