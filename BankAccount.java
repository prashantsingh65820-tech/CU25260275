class BankAccount {
    int accountNumber;
    double balance;

    static String bankName = "State Bank";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountNumber = 101;
        account.balance = 5000;

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + account.accountNumber);

        account.deposit(2000);
    }
}