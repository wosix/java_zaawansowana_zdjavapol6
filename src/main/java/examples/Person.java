package examples;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String name;
    private String lastName;
    private LocalDate birthDate;
    private int height;


    public Person(String name, String lastName, LocalDate birthDate, int height) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print(Person person) {
        System.out.println(String.format("Name: %s; Lastname: %s; Brirthdate: %s", name, lastName, birthDate, height));
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS CALLED");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate) &&
                Objects.equals(height, person.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
