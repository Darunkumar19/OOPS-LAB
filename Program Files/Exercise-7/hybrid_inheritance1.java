class CelestialBody {
    void showType() {
        System.out.println("This is a celestial body in space.");
    }
}

class Planet extends CelestialBody {
    void showPlanet() {
        System.out.println("This is a planet orbiting a star.");
    }
}

class Star extends CelestialBody {
    void showStar() {
        System.out.println("This is a star shining in the galaxy.");
    }
}

class Moon extends Planet {
    void showMoon() {
        System.out.println("This is a moon orbiting a planet.");
    }
}

class Galaxy extends Star {
    void showGalaxy() {
        System.out.println("This is a vast galaxy containing stars, planets, and moons.");
    }
}

public class hybrid_inheritance1 {
    public static void main(String[] args) {
        Moon earthMoon = new Moon();
        earthMoon.showType();
        earthMoon.showPlanet();
        earthMoon.showMoon();

        System.out.println("\n-----------------\n");

        Galaxy milkyWay = new Galaxy();
        milkyWay.showType();
        milkyWay.showStar();
        milkyWay.showGalaxy();
    }
}
