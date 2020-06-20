package vehicles;

public class Vehicle {

    public Vehicle(){
        System.out.println("Empty Vehicle constructor.");
    }

    public void run(double velocity){
        System.out.println("Vehicle running at speed " + velocity + ".");
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
