class Spell {
    void cast() {
        System.out.println("Casting a generic magical spell...");
    }
}

class FireSpell extends Spell {
    @Override
    void cast() {
        System.out.println("Casting Fireball! 🔥");
    }
}

class IceSpell extends Spell {
    @Override
    void cast() {
        System.out.println("Casting Ice Storm! ❄️");
    }
}

public class method_overriding1 {
    public static void main(String[] args) {
        Spell baseSpell = new Spell();
        Spell fire = new FireSpell();
        Spell ice = new IceSpell();

        baseSpell.cast();
        fire.cast();
        ice.cast();
    }
}