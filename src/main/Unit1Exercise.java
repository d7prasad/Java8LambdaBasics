package main;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Adam", "GillChrist", 25),
                new Person("George", "Wahington", 40),
                new Person("Abraham", "Lincholn", 28)
        );
        Collections.sort(list, (Person p, Person p2) ->
            p.getLastName().compareTo(p2.getLastName()) );
        printList(list);
    }

    public static void printList(List<Person> list) {
        for(Person p : list){
            System.out.println(p);
        }
    }
}
