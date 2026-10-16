class Car {
    String brand;
    double mileage;

    static int wheels = 4;

    void display() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.mileage = 18.5;

        c.display();
    }
}