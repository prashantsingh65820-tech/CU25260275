class GenericMethod {
    static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(100);
        display(25.5);
        display("Java");
        display('A');
    }
}