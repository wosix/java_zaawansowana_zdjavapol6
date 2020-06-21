package vehicles;

public class Vehicle {
    protected double velocity;

    public Vehicle() {
        velocity = 0;
    }

    public Vehicle(double velocity) {
        this.velocity = velocity;
    }

    public void run(double velocity) {
        System.out.println("Vehicle running at speed " + velocity + ".");
    }

    @Override
    public String toString() {
        return "Vehicle{speed=" + velocity + "}";
    }
}
