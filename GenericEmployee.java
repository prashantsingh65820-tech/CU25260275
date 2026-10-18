class Employee<T, U> {
    T employeeId;
    U employeeName;

    Employee(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class GenericEmployee {
    public static void main(String[] args) {
        Employee<Integer, String> e =
            new Employee<>(10, "Prashant");

        e.display();
    }
}