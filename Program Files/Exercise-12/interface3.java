interface Payment {
    void makePayment();
}

class CreditCard implements Payment {
    public void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPI implements Payment {
    public void makePayment() {
        System.out.println("Payment made using UPI.");
    }
}

public class interface3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        p1.makePayment();
        p2.makePayment();
    }
}
