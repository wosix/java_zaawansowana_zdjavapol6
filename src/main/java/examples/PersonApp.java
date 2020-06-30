package examples;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.util.*;

public class PersonApp {
    static Person person;

    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Wojciech", "Kowalski", LocalDate.now(),143));
        people.add(new Person("Janek", "Nowak", LocalDate.now().minusYears(20),124));
        people.add(new Person("Ryszard", "Kowal", LocalDate.now().minusWeeks(90),243));
        people.add(new Person("Janusz", "Drwal", LocalDate.now().minusYears(45),178));
        people.add(new Person("Janush", "Polack", LocalDate.now().minusWeeks(490),184));

        for (Person person : people) {
            person.print(person);
        }
        System.out.println("--------------------");

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

    }
}
