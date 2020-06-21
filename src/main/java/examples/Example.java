package examples;

public class Example {
    String authorFirstName;
    String authorLastName;

    Example(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }


    @Override
    public String toString() {
        String string = String.format("First name: %s; Last name: %s", authorFirstName, authorLastName);
        System.out.println(string);
        return this.getClass().getName();
    }
}
