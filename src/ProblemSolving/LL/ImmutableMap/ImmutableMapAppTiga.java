package ProblemSolving.LL.ImmutableMap;

import java.util.Collections;
import java.util.Map;

public class ImmutableMapAppTiga {
    public static void main(String[] args) {

        //3. Membuat map dengan satu jumlah key-value
        // Membuat Map dengan satu pasang key-value
        Map<String, Integer> singletonMap = Collections.singletonMap("apple", 1);

        System.out.println(singletonMap); // Output: {apple=1}

        // Mencoba mengubah singletonMap
        try {
            singletonMap.put("banana", 2);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }

        // Mencoba menghapus entri dari singletonMap
        try {
            singletonMap.remove("apple");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }
    }
}