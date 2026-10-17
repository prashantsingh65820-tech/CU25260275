class NameInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Prashant");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        NameInterface obj = new NameInterface();
        Thread t = new Thread(obj);
        t.start();
    }
}