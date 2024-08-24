package ProblemSolving.MM.SortedMapInterface;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class ImmutableSortedMapAppDua {
    public static void main(String[] args) {

        //2. Mengubah mutable sorted map menjadi immutable
        // Membuat SortedMap mutable
        SortedMap<String, Integer> mutableMap = new TreeMap<>();
        mutableMap.put("apple", 1);
        mutableMap.put("banana", 2);
        mutableMap.put("cherry", 3);
        System.out.println("Mutable Map: " + mutableMap);

        // Membuat salinan immutable dari mutableMap
        SortedMap<String, Integer> immutableMap = Collections.unmodifiableSortedMap(mutableMap);
        System.out.println("Immutable Map: " + immutableMap);

        // Mencoba menambahkan elemen ke immutableMap (tidak bisa)
        // immutableMap.put("durian", 4); // UnsupportedOperationException

        // Mencoba mengubah elemen di immutableMap (tidak bisa)
        // immutableMap.put("apple", 5); // UnsupportedOperationException

        // Mencoba menghapus elemen dari immutableMap (tidak bisa)
        // immutableMap.remove("banana"); // UnsupportedOperationException
    }
}