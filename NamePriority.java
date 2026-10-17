class NamePriority {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());

        t.setName("MyMainThread");

        System.out.println("New Name: " + t.getName());
    }
}