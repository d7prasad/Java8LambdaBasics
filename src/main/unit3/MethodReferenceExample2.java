package main.unit3;

import main.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Adam", "smith", 20),
                new Person("William", "Smith", 20));
//        printConditioanlly(people, p -> p.getLastName().startsWith("s"), p-> System.out.println(p));
//        This can be also done using the below
        printConditioanlly(people, p -> true, System.out::println);
    }

    public static void printConditioanlly(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
