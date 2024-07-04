package NavigableSet;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;

public class NavigableSetApp {

    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>(Set.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();

        System.out.println(names);

        System.out.println(namesReverse);

        NavigableSet<String> kurniawan = names.tailSet("Kurniawan", true);

        System.out.println(kurniawan);

        for (var name : kurniawan) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups");
        System.out.println(immutable);

    }
}
