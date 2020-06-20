package vehicles;

public class Car extends Vehicle {
    int passengers;

    public Car() {
        System.out.println("Empty Car constructor.");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Car running at speed " + velocity + ".");
    }

    public void addPassenger() {
        ++passengers;
        System.out.println("Added passenger. Current number " + passengers + ".");
    }

    public void removePassenger() {
        if (passengers < 1) {
            return;
        }

        --passengers;
        System.out.println("Removed passenger. Current number " + passengers + ".");
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }
}
