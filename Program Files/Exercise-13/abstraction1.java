abstract class Course {
    abstract void enroll();
    abstract void complete();
}

class JavaCourse extends Course {
    void enroll() {
        System.out.println("Enrolled in Java course.");
    }
    void complete() {
        System.out.println("Completed Java course!");
    }
}

class PythonCourse extends Course {
    void enroll() {
        System.out.println("Enrolled in Python course.");
    }
    void complete() {
        System.out.println("Completed Python course!");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        Course c1 = new JavaCourse();
        Course c2 = new PythonCourse();
        c1.enroll();
        c1.complete();
        c2.enroll();
        c2.complete();
    }
}
