package Animals;

public class Dog extends Animal {


    @Override
    void introduce() {
        System.out.println("Jestem psem!");
    }

    @Override
    void sound() {
        System.out.println("hau hau");
    }

    @Override
    void trick() {
        System.out.println("*staje na dwóch łapach*");
    }

}
