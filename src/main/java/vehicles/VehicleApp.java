package vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.removePassenger();
        car.removePassenger();

        car.run(87);

        vehicle.run(54);
        vehicle = new Car();
        vehicle.run(36);


        System.out.println(car);
    }
}
