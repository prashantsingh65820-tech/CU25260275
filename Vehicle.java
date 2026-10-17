class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

interface Electric {
    void chargeBattery();
}

class VehicleTest extends Car implements Electric {

    public void chargeBattery() {
        System.out.println("Battery charging");
    }

    public static void main(String[] args) {
        VehicleTest e = new VehicleTest();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}