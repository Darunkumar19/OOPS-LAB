package science;
import science.phy.phy;

public class sci {
    public static void main(String[] args) {
        phy physics = new phy();

        System.out.println("Force (F = m * a): " + physics.calculateForce(10, 9.8));
        System.out.println("Kinetic Energy (KE = 0.5 * m * v^2): " + physics.calculateKineticEnergy(2, 3));
        System.out.println("Potential Energy (PE = m * g * h): " + physics.calculateGravitationalPotentialEnergy(2, 10, 9.8));
    }
}
