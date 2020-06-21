package examples;

public class ExampleApp {
    public static void main(String[] args) {
        Example example = new Example("Jan", "Kowal");

        System.out.println(example.getClass().getCanonicalName());


        System.out.println(example.toString());
    }
}
