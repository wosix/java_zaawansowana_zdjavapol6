package Animals;

public class Person {

    private Animal animal;

    public Person() {
        this.animal = new Cat();
    }

    public Person(Animal animal){
        this.animal = animal;
    }


    void showAnimal() {
        animal.introduce();
        animal.sound();
        animal.trick();
    }

    void setAnimal(Animal animal){
        this.animal = animal;
    }
}
