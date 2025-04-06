interface Music {
    void play();
}

class Guitar implements Music {
    public void play() {
        System.out.println("Playing guitar melody...");
    }
}

class Piano implements Music {
    public void play() {
        System.out.println("Playing piano harmony...");
    }
}

public class interface1{
    public static void main(String[] args) {
        Music m1 = new Guitar();
        Music m2 = new Piano();
        m1.play();
        m2.play();
    }
}
