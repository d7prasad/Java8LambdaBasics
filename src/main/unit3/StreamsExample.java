package main.unit3;

import main.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Adam", "smith", 20),
                new Person("William", "Smith", 20));
        people.stream()
                .filter(p -> p.getLastName().startsWith("s"))
                .forEach(System.out::println);
    }
}
