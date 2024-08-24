package ProblemSolving.LL.ImmutableMap;

import java.util.Collections;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        //1.  Membuat immutable map kosong

        // Membuat Map kosong yang immutable
        Map<String, Integer> emptyMap = Collections.emptyMap();
        System.out.println(emptyMap); // Output: {}

        // Mencoba mengubah emptyMap
        try {
            emptyMap.put("key", 1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }

        // Mendapatkan nilai dari emptyMap
        System.out.println(emptyMap.get("key")); // Output: null
    }
}