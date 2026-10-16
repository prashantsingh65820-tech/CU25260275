class TriangleValidity {
    int a, b, c;

    static String type = "Scalene/Isosceles/Equilateral";

    void check() {
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;

        if (sum1 > c && sum2 > a && sum3 > b) {
            System.out.println("Valid Triangle");

            if (a == b && b == c)
                System.out.println("Type: Equilateral");
            else if (a == b || b == c || a == c)
                System.out.println("Type: Isosceles");
            else
                System.out.println("Type: Scalene");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        TriangleValidity t = new TriangleValidity();

        t.a = 5;
        t.b = 5;
        t.c = 6;

        t.check();
    }
}