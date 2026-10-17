class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ThreadPriority high = new ThreadPriority("High Priority");
        ThreadPriority low = new ThreadPriority("Low Priority");

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        System.out.println(high.getName() + ": " + high.getPriority());
        System.out.println(low.getName() + ": " + low.getPriority());

        high.start();
        low.start();
    }
}