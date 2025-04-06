
class Delivery {
    void deliver() {
        System.out.println("Delivering a package...");
    }
}

class FoodDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivering hot food to your doorstep! ");
    }
}

class GroceryDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivering fresh groceries to your home! ");
    }
}

public class method_overriding2 {
    public static void main(String[] args) {
        Delivery d1 = new Delivery();
        Delivery d2 = new FoodDelivery();
        Delivery d3 = new GroceryDelivery();

        d1.deliver();
        d2.deliver();
        d3.deliver();
    }
}
