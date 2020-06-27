package examples;

import java.time.LocalDate;
import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {

        Map<String, Person> people = new HashMap<>();
        people.put("1", new Person("wojtek", "adamix", LocalDate.now()));
        people.put("2", new Person("janek", "wosix", LocalDate.of(2001, 7, 11)));

        Set<Map.Entry<String, Person>> elements = people.entrySet();
        for (Map.Entry<String, Person> element : elements) {
            String key = element.getKey();
            Person value = element.getValue();
            System.out.println("#" + key + ": " + value);
        }


        people.put("1", new Person("Wojciech", "adamix", LocalDate.now()));

        for (Map.Entry<String, Person> element : elements) {
            String key = element.getKey();
            Person value = element.getValue();
            System.out.println("#" + key + ": " + value);
        }


        System.out.println(people.get(1).hashCode());
    }
}
