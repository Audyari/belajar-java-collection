package ProblemSolving.G.ImplementasiSortedSet;

import ProblemSolving.G.ImplementasiSortedSet.DATA.Person;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImplementasiSortedSetAppV2 {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new DataPerbandinganApp());

        // Buat Disending atau Terbalik
        // SortedSet<Person> people = new TreeSet<>(new DataPerbandinganApp().reversed());

        people.add(new Person("Budi"));
        people.add(new Person("Audy"));
        people.add(new Person("Candra"));


        for (var person : people){
            System.out.println(person.getName());
        }

        // tujuan untuk membuat SortedSet<Person> yang tidak dapat dimodifikasi.
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Kurniawan"));

    }
}