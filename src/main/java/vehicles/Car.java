package vehicles;

public class Car extends Vehicle {
    int passengers;
    double velocity;

    public Car(){
    }

    public Car(double velocity) {
        this.velocity = velocity;
//        System.out.println("Empty Car constructor.");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Car running at speed " + velocity + ".");
    }

    public void addPassenger() {
        if (passengers == 4){
            return;
        }

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
                "; speed="+ velocity +
                '}';
    }
}
