class Temperature {
    double celsius;

    static String scale = "Celsius";

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Kelvin = " + kelvin);
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();

        t.celsius = 25;
        t.convert();
    }
}