class BankAccountValidation {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void main(String[] args) {
        BankAccountValidation b = new BankAccountValidation();

        b.setAccountNumber(1001);
        b.setAccountHolder("Aman");

        b.deposit(5000);
        b.withdraw(1500);
        b.withdraw(5000);

        System.out.println("Balance: " + b.getBalance());
    }
}