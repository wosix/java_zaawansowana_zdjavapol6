package Animals;

public class Cat extends Animal {

    @Override
    void introduce() {
        System.out.println("Jestem kotem!");
    }

    @Override
    void sound() {
        System.out.println("miau!");
    }

    @Override
    void trick() {
        System.out.println("*skacze bardzo wysoko*");
    }
}
