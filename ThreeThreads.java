import java.util.Random;

class ThreeThreads extends Thread {
    ThreeThreads(String name) {
        super(name);
    }

    public void run() {
        try {
            Random r = new Random();
            int delay = r.nextInt(501);

            Thread.sleep(delay);

            System.out.println(getName() + " - Message printed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreeThreads reader = new ThreeThreads("Reader");
        ThreeThreads writer = new ThreeThreads("Writer");
        ThreeThreads logger = new ThreeThreads("Logger");

        reader.start();
        writer.start();
        logger.start();
    }
}