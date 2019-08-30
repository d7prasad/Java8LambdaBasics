package main.unit3;

import main.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Adam", "smith", 20),
                new Person("William", "Smith", 20));
        for(Person p: people){
            System.out.println(p);
        }
        people.forEach(p -> System.out.println(p));
    }
}
