package vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car(45);
        ConvertibleCar convertibleCar = new ConvertibleCar();
        Truck truck = new Truck();

        System.out.println(vehicle);
        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.addPassenger();
        car.removePassenger();
        car.removePassenger();

        car.run(87);

        vehicle.run(105);
        vehicle = new Car();
        vehicle.run(36);

        System.out.println(car);
        System.out.println(vehicle);


        convertibleCar.addPassenger();
        System.out.println(convertibleCar);
        convertibleCar.closeRoof();
        convertibleCar.openRoof();
        convertibleCar.openRoof();
        convertibleCar.closeRoof();

        truck.run(66);
        truck.addPackages();

    }
}
