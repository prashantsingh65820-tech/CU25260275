class Product<T, U> {
    T productId;
    U price;

    Product(T productId, U price) {
        this.productId = productId;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId +
                           ", Price: " + price);
    }
}

class GenericProduct {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 499.50);
        Product<Integer, Double> p2 = new Product<>(102, 799.00);
        Product<Integer, Double> p3 = new Product<>(103, 999.99);

        p1.display();
        p2.display();
        p3.display();
    }
}