class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println("Student studies " + course);
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Teacher teaches " + subject);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Java";

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}