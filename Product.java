class Product {
    int id;
    String name;
    double price;

    static double discountRate = 10;

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();

        p.id = 101;
        p.name = "Laptop";
        p.price = 50000;

        p.calculatePrice();
    }
}