class BankAccount {
    int balance = 10000;

    void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            balance -= amount;
        }
    }
}

class RaceCondition extends Thread {
    BankAccount account;

    RaceCondition(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        RaceCondition t1 = new RaceCondition(account);
        RaceCondition t2 = new RaceCondition(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}