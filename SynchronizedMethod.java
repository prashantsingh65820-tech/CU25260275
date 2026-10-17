class BankAccount {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}

class SynchronizedMethod extends Thread {
    BankAccount account;

    SynchronizedMethod(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        SynchronizedMethod t1 = new SynchronizedMethod(account);
        SynchronizedMethod t2 = new SynchronizedMethod(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}