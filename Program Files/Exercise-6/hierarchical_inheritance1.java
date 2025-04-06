class Vehicle {
    void fuelType() {
        System.out.println("Most vehicles run on fuel.");
    }
}

class Car extends Vehicle {
    void carType() {
        System.out.println("Car Type: Sedan");
    }
}

class Bike extends Vehicle {
    void bikeType() {
        System.out.println("Bike Type: Sports Bike");
    }
}

public class hierarchical_inheritance1{
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        System.out.println("Car:");
        myCar.fuelType();
        myCar.carType();

        System.out.println("\nBike:");
        myBike.fuelType();
        myBike.bikeType();
    }
}
