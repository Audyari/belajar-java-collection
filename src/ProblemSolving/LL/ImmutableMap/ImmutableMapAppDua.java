package ProblemSolving.LL.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapAppDua {
    public static void main(String[] args) {

        //2 Mengubah mutable map menjadi immutable
        // Membuat Map mutable
        Map<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("apple", 1);
        mutableMap.put("banana", 2);
        mutableMap.put("cherry", 3);

        // Mengubah Map mutable menjadi immutable
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);

        System.out.println(immutableMap); // Output: {apple=1, banana=2, cherry=3}

        // Mencoba mengubah immutableMap
        try {
            immutableMap.put("orange", 4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }

        // Mencoba menghapus entri dari immutableMap
        try {
            immutableMap.remove("banana");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }
    }
}