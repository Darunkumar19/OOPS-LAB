abstract class Restaurant {
    abstract void orderFood();
    abstract void serveFood();
}

class ItalianRestaurant extends Restaurant {
    void orderFood() {
        System.out.println("Ordering pasta from Italian Restaurant.");
    }

    void serveFood() {
        System.out.println("Serving spaghetti and garlic bread.");
    }
}

class IndianRestaurant extends Restaurant {
    void orderFood() {
        System.out.println("Ordering biryani from Indian Restaurant.");
    }

    void serveFood() {
        System.out.println("Serving biryani with raita.");
    }
}

public class abstraction4 {
    public static void main(String[] args) {
        Restaurant r1 = new ItalianRestaurant();
        Restaurant r2 = new IndianRestaurant();

        r1.orderFood();
        r1.serveFood();

        r2.orderFood();
        r2.serveFood();
    }
}
