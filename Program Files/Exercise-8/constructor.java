class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " , Age: " + age);
    }}

public class constructor{

    public static void main(String[] args) {
        Person p3 = new Person("Kevin", 18);

        p3.display();
    }
}
