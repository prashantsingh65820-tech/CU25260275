class Employee {
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
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

interface Researcher {
    void conductResearch();
}

class Teacher extends Employee implements Researcher {
    String subject;

    void teach() {
        System.out.println("Teaching: " + subject);
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher conducts research");
    }

    @Override
    double calculateSalary() {
        return getSalary() + 5000;
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing: " + department);
    }
}

class UniversityEmployee {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setEmployeeId(101);
        t.setEmployeeName("Rahul");
        t.setSalary(40000);
        t.subject = "Java";

        System.out.println("Teacher Details:");
        t.displayDetails();
        t.teach();
        t.conductResearch();
        System.out.println("Salary: " + t.calculateSalary());

        VisitingTeacher vt = new VisitingTeacher();
        vt.setEmployeeId(102);
        vt.setEmployeeName("Aman");
        vt.hoursWorked = 20;

        System.out.println("\nVisiting Teacher:");
        vt.displayDetails();
        System.out.println("Salary: " + vt.calculateSalary());

        Admin a = new Admin();
        a.setEmployeeId(103);
        a.setEmployeeName("Neha");
        a.setSalary(35000);
        a.department = "Administration";

        System.out.println("\nAdmin Details:");
        a.displayDetails();
        a.manageDepartment();
    }
}