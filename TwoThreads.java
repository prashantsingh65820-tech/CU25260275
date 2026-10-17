class TwoThreads extends Thread {
    TwoThreads(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        TwoThreads t1 = new TwoThreads("Thread-1");
        TwoThreads t2 = new TwoThreads("Thread-2");

        t1.start();
        t2.start();
    }
}