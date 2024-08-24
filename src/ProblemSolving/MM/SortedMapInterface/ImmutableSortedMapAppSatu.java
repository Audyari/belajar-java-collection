package ProblemSolving.MM.SortedMapInterface;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class ImmutableSortedMapAppSatu {
    public static void main(String[] args) {

        //1. Membuat immutable sorted map kosong
        // Membuat SortedMap kosong yang immutable
        SortedMap<String, Integer> immutableMap = Collections.emptySortedMap();
        System.out.println("Immutable Map: " + immutableMap);

        // Mencoba menambahkan elemen ke immutableMap (tidak bisa)
        // immutableMap.put("apple", 1); // UnsupportedOperationException

        // Membuat SortedMap yang dapat diubah
        SortedMap<String, Integer> mutableMap = new TreeMap<>();
        mutableMap.put("apple", 1);
        mutableMap.put("banana", 2);
        mutableMap.put("cherry", 3);
        System.out.println("Mutable Map: " + mutableMap);

        // Membuat salinan yang immutable dari mutableMap
        //SortedMap<String, Integer> immutableCopy = Collections.unmodifiableMap(mutableMap);
        //System.out.println("Immutable Copy: " + immutableCopy);

        // Mencoba menambahkan elemen ke immutableCopy (tidak bisa)
        // immutableCopy.put("durian", 4); // UnsupportedOperationException
    }
}