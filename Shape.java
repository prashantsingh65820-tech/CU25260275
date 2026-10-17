class Shape {
    void calculateArea() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea();
        r.calculateArea();
    }
}