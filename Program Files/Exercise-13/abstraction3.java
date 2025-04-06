abstract class DeliveryApp {
    abstract void orderFood();
    abstract void trackOrder();
}

class Swiggy extends DeliveryApp {
    void orderFood() {
        System.out.println("Ordering food through Swiggy.");
    }
    void trackOrder() {
        System.out.println("Tracking order on Swiggy.");
    }
}

class Zomato extends DeliveryApp {
    void orderFood() {
        System.out.println("Ordering food through Zomato.");
    }
    void trackOrder() {
        System.out.println("Tracking order on Zomato.");
    }
}

public class abstraction3 {
    public static void main(String[] args) {
        DeliveryApp app1 = new Swiggy();
        DeliveryApp app2 = new Zomato();
        app1.orderFood();
        app1.trackOrder();
        app2.orderFood();
        app2.trackOrder();
    }
}
