class ElectricBill {
    int units;

    static double fixedCharge = 100;

    void calculateBill() {
        int consumedUnits = units;
        double bill;

        if (consumedUnits <= 100)
            bill = consumedUnits * 5;
        else if (consumedUnits <= 200)
            bill = consumedUnits * 7;
        else
            bill = consumedUnits * 10;

        double total = bill + fixedCharge;

        System.out.println("Units: " + consumedUnits);
        System.out.println("Total Bill = " + total);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();

        e.units = 150;
        e.calculateBill();
    }
}