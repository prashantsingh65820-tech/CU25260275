class StudentEncapsulation {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }

    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation();

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85.5);

        s.displayDetails();
    }
}