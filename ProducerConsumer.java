class Buffer {
    private int value;
    private boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }

        this.value = value;
        available = true;

        System.out.println("Produced: " + value);
        notify();
    }

    synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();
        }

        int result = value;
        available = false;

        System.out.println("Consumed: " + result);
        notify();

        return result;
    }
}

class ProducerConsumer {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        producer.start();
        consumer.start();
    }
}