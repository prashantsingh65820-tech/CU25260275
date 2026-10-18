class GenericThreeValue {
    static <T> void display(T a, T b, T c) {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        display(10, 20, 30);
        display("A", "B", "C");
        display(1.5, 2.5, 3.5);
    }
}