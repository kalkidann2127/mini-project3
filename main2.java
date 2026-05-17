class Person {

    // Protected Access Modifier
    protected String name;

    // Default Constructor
    Person() {
        System.out.println("Person Constructor Called");
    }

    // Parameterized Constructor
    Person(String name) {

        // this keyword
        this.name = name;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
    }

    // final method
    final void rules() {
        System.out.println("University rules must be followed.");
    }

    // Static Method
    static void staticInfo() {
        System.out.println("Static method inside Person class.");
    }
}


// Single Inheritance
class Student extends Person {

    protected int studentId;

    Student(String name, int studentId) {

        // super() constructor call
        super(name);

        this.studentId = studentId;
    }

    // Method Overriding
    @Override
    void displayInfo() {

        // super keyword (method)
        super.displayInfo();

        System.out.println("Student ID: " + studentId);
    }

    // Method Hiding (Static Method)
    static void staticInfo() {
        System.out.println("Static method inside Student class.");
    }
}


// Multilevel Inheritance
class GraduateStudent extends Student {

    String researchTopic;

    GraduateStudent(String name, int studentId, String researchTopic) {

        super(name, studentId);

        this.researchTopic = researchTopic;
    }

    @Override
    void displayInfo() {

        super.displayInfo();

        System.out.println("Research Topic: " + researchTopic);
    }
}


// Hierarchical Inheritance
class Teacher extends Person {

    String subject;

    Teacher(String name, String subject) {

        super(name);

        this.subject = subject;
    }

    @Override
    void displayInfo() {

        super.displayInfo();

        System.out.println("Subject: " + subject);
    }
}


// final class
final class University {

    void universityName() {
        System.out.println("BITS University");
    }
}


public class Main {

    public static void main(String[] args) {

        System.out.println("----- Student Object -----");

        Student s1 = new Student("Abel", 101);

        s1.displayInfo();

        s1.rules();

        System.out.println();


        System.out.println("----- Graduate Student Object -----");

        GraduateStudent g1 =
                new GraduateStudent(
                        "Helen",
                        202,
                        "Artificial Intelligence"
                );

        g1.displayInfo();

        System.out.println();


        System.out.println("----- Teacher Object -----");

        Teacher t1 =
                new Teacher(
                        "Mr. Daniel",
                        "Programming"
                );

        t1.displayInfo();

        System.out.println();


        System.out.println("----- Static Method Hiding -----");

        Person.staticInfo();

        Student.staticInfo();

        System.out.println();


        System.out.println("----- Final Class Example -----");

        University u = new University();

        u.universityName();


        // Multiple Inheritance Restriction
        // Java does NOT support:
        // class C extends A, B
        // because it creates ambiguity problems.


        // Implicit super() Rule
        // If super() is not written,
        // Java automatically inserts it.
    }
}
