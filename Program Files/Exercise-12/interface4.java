interface Ability {
    void useAbility();
}

class Warrior implements Ability {
    public void useAbility() {
        System.out.println("Warrior uses Sword Slash!");
    }
}

class Mage implements Ability {
    public void useAbility() {
        System.out.println("Mage casts Fireball!");
    }
}

public class interface4 {
    public static void main(String[] args) {
        Ability a1 = new Warrior();
        Ability a2 = new Mage();
        a1.useAbility();
        a2.useAbility();
    }
}
