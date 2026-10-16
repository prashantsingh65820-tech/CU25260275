class Student {
    static int count = 0;

    String name;
    int age;

    void display() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.age = 20;
        count++;

        s2.name = "Aman";
        s2.age = 21;
        count++;

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}