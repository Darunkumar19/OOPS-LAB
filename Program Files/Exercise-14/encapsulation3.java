
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        if (s > 0)
            salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class encapsulation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
