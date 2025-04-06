class Superhero {
    void power() {
        System.out.println("Superhero uses a mysterious power!");
    }

    void power(String type) {
        System.out.println("Superhero uses " + type + " power!");
    }

    void power(String type, int level) {
        System.out.println("Superhero uses " + type + " power at level " + level + "!");
    }
}

public class method_overloading1 {
    public static void main(String[] args) {
        Superhero hero = new Superhero();

        hero.power();
        hero.power("Lightning");
        hero.power("Fire", 9000);
    }
}
