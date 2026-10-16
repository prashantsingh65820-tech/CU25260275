class BankAccountWithdrawal  {
    double balance;

    static String bankCode = "ABC123";

    void withdraw(double amount) {
        double withdrawal = amount;

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccountWithdrawal account = new BankAccountWithdrawal();

        account.balance = 10000;

        System.out.println("Bank Code: " + bankCode);

        account.withdraw(3000);
    }
}