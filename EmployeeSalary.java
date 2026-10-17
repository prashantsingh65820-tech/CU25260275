class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 60000;
    }
}

class EmployeeSalaryTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}