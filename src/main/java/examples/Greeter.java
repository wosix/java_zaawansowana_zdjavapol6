package examples;

public class Greeter {
    void greet() {
        greet("World");
//      System.out.println("Hello, World!");
    }

    void greet(String name) {
        greet("Hello", name);
//        System.out.println("Hello, " + name + ".");
    }

    void greet(String greeting, String name) {
        String message = String.format("%s, %s!", greeting, name);
        System.out.println(message);
//        System.out.println(greeting + ", " + name + "!");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        greeter.greet();
        greeter.greet("Wojciech");
        greeter.greet("Hej", "Wojtek");
    }
}
