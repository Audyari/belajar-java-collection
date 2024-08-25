package ProblemSolving.SSS.CollectionsClass;

import ProblemSolving.SSS.CollectionsClass.DATANYA.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

import static java.util.Collections.max;

public class ContohTigaApp {

    public static void main(String[] args) {

        //3. Mengambil element paling tinggi di list
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
        String maxElement = max(list);
        System.out.println(maxElement); // Output: "date"

        List<Person> persons = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        Person maxPerson = max(persons, Comparator.comparing(Person::getUsia));
        System.out.println(maxPerson.getNama()); // Output: "Charlie"
    }
}
