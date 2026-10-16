class CompareSalaries {
    String name;
    double salary;

    static String organization = "ABC Company";

    public static void main(String[] args) {
        CompareSalaries e1 = new CompareSalaries();
        CompareSalaries e2 = new CompareSalaries();

        e1.name = "Rahul";
        e1.salary = 40000;

        e2.name = "Aman";
        e2.salary = 50000;

        double salary1 = e1.salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2)
            System.out.println(e1.name + " has higher salary.");
        else if (salary2 > salary1)
            System.out.println(e2.name + " has higher salary.");
        else
            System.out.println("Both have equal salary.");
    }
}