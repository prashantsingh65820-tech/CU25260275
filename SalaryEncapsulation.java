class SalaryEncapsulation {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0 && salary <= 1000000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        SalaryEncapsulation e = new SalaryEncapsulation();

        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");

        e.setSalary(50000);
        e.display();

        e.setSalary(1500000);
    }
}