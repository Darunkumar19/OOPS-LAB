package science.phy;

public class phy {
    public double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public double calculateGravitationalPotentialEnergy(double mass, double height, double g) {
        return mass * g * height;
    }
}
