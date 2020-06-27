package Animals;

public class Bird extends Animal {

    @Override
    void introduce() {
        System.out.println("Jestem ptakiem!");
    }

    @Override
    void sound() {
        System.out.println("ćwir ćwir");
    }

    @Override
    void trick() {
        System.out.println("*robi beczki*");
    }
}
