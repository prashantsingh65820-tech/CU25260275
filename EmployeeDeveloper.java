class Employee {
    String name;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writes code in " + programmingLanguage);
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Conducts meeting in " + department);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Aman";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.name = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}