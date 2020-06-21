package vehicles;

public class Truck extends Vehicle{
    double velocity;

    Truck(){
    }

    Truck(double velocity){
        super(velocity);
        this.velocity = velocity;
    }

    void addPackages(){
        if (velocity < 10){
            return;
        }
        velocity = velocity - 10;
    }

    @Override
    public void run(double velocity){
        if (velocity > 80){
            return;
        }
        run(velocity); // :(((
    }
}
