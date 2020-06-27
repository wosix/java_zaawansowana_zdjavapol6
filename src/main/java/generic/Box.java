package generic;

public class Box<T> {

    private T element;

    public void set (T t){
        this.element = t;
    }

    public T get() { return element;}

    public <U> void exampleGenericMethod(U argument) {

        System.out.println("Argument: " + argument.toString());

        System.out.println("Class: " + argument.getClass().getName());
    }

    public static <T> void genericMethod (T argument) {
        System.out.println("Got argument of class: " + argument.getClass().getCanonicalName());
    }
}
