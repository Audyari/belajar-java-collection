package ProblemSolving.LL.ImmutableMap;

import java.util.Map;

public class ImmutableMapAppEmpat {
    public static void main(String[] args) {

        //4. Membuat immutable map dari key-value
        // Membuat Map immutable dengan Map.of(...)
        Map<String, Integer> immutableMap = Map.of(
                "apple", 1,
                "banana", 2,
                "cherry", 3
        );

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
    }
}
