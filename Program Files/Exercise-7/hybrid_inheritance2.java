class Character {
    void showCharacter() {
        System.out.println("This is a character from an anime.");
    }
}

class Hero extends Character {
    void showHero() {
        System.out.println("This is a hero with special powers.");
    }
}

class Villain extends Character {
    void showVillain() {
        System.out.println("This is a villain with dark ambitions.");
    }
}

class Sidekick extends Hero {
    void showSidekick() {
        System.out.println("This is a loyal sidekick who supports the hero.");
    }
}

class Organization extends Villain {
    void showOrganization() {
        System.out.println("This is a secret organization of powerful villains.");
    }
}

public class hybrid_inheritance2{
    public static void main(String[] args) {
        Sidekick support = new Sidekick();
        support.showCharacter();
        support.showHero();
        support.showSidekick();

        System.out.println("\n-----------------\n");

        Organization darkGroup = new Organization();
        darkGroup.showCharacter();
        darkGroup.showVillain();
        darkGroup.showOrganization();
    }
}
