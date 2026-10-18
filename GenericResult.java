class Result<T> {
    T marks;

    Result(T marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

class GenericResult {
    public static void main(String[] args) {
        Result<Integer> r1 = new Result<>(85);
        Result<Double> r2 = new Result<>(91.5);

        r1.display();
        r2.display();
    }
}