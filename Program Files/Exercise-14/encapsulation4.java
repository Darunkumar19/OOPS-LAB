import java.util.Scanner;

class Product {
    private String productName;
    private double price;

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double p) {
        if (p > 0)
            price = p;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class encapsulation4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter product name: ");
        p.setProductName(sc.nextLine());

        System.out.print("Enter price: ");
        p.setPrice(sc.nextDouble());

        System.out.println("Product: " + p.getProductName());
        System.out.println("Price: $" + p.getPrice());
    }
}
