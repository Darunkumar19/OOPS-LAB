import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

public class encapsulation1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter age: ");
        s.setAge(sc.nextInt());

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
