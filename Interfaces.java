class Employee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {

    public void writeCode() {
        System.out.println("Developer writes code");
    }

    public void conductResearch() {
        System.out.println("Developer conducts research");
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Rahul");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}