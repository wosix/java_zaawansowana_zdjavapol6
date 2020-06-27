package vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Road<T extends Vehicle> {
    List<T> vehicles = new ArrayList<>();

    void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }

    void limitSpeed() {
        // TODO - sprawdz czy pojazd jedzie wiecej jesli tak zmien na 40 jesli nie zostaw aktualna predkosc
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).run(40);
        }
    }



    @Override
    public String toString() {
        return "Road{" +
                "vehicles=" + vehicles +
                '}';
    }
}
