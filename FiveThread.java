class FiveThread extends Thread {
    FiveThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() +
                    " Priority: " + getPriority() +
                    " Count: " + i);
        }
    }

    public static void main(String[] args) {
        FiveThread t1 = new FiveThread("Thread-1", 1);
        FiveThread t2 = new FiveThread("Thread-2", 3);
        FiveThread t3 = new FiveThread("Thread-3", 5);
        FiveThread t4 = new FiveThread("Thread-4", 7);
        FiveThread t5 = new FiveThread("Thread-5", 9);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}