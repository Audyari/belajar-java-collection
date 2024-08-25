package ProblemSolving.SSS.CollectionsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import ProblemSolving.SSS.CollectionsClass.DATANYA.Person;

import static java.util.Collections.min;


public class ContohKeEmpatApp {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        int minNumber = min(numbers);
        System.out.println(minNumber); // Output: 1

        List<Person> persons = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        Person minPerson = min(persons, Comparator.comparing(Person::getUsia));
        System.out.println(minPerson.getNama()); // Output: "Bob"
    }
}
