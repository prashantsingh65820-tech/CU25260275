class Rectangle {
    int length;
    int breadth;

    static String shapeName = "Rectangle";

    void area() {
        int result = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + result);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.area();
    }
}