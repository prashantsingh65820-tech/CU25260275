class Name extends Thread {
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
        Name t = new Name();
        t.start();
    }
}