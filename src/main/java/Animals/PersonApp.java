package Animals;

import vehicles.Car;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person();

        person.showAnimal();

        person.setAnimal(new Dog());

        person.showAnimal();

        person.setAnimal(new Bird());

        person.showAnimal();
    }
}
