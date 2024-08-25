package ProblemSolving.NN.NavigableMapInterface;

import java.util.*;

public class ContohKasusDua {

    public static void main(String[] args) {

        //2. Mengubah mutable navigable set menjadi immutable
        // Membuat mutable NavigableMap
        NavigableMap<String, Integer> mutableMap = new TreeMap<>();
        mutableMap.put("Apple", 1);
        mutableMap.put("Banana", 2);
        mutableMap.put("Cherry", 3);
        mutableMap.put("Date", 4);

        // Membuat unmodifiable NavigableMap
        NavigableMap<String, Integer> unmodifiableMap = Collections.unmodifiableNavigableMap(mutableMap);

        System.out.println("Mutable map: " + mutableMap);
        System.out.println("Unmodifiable map: " + unmodifiableMap);

        // Mencoba mengubah unmodifiableMap
        try {
            unmodifiableMap.put("Elderberry", 5);
        } catch (UnsupportedOperationException e) {
            System.out.println("Tidak dapat mengubah unmodifiableMap");
        }

        // Perubahan pada mutableMap tidak mempengaruhi unmodifiableMap
        mutableMap.put("Fig", 6);
        System.out.println("Mutable map: " + mutableMap);
        System.out.println("Unmodifiable map: " + unmodifiableMap);
    }
}