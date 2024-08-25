package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohEmpatApp {

    public static void main(String[] args) {

        // Mengambil data berdasarkan key, jika tidak ada, return defaultValue
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mengambil nilai untuk key "Alice"
        int aliceScore = scores.getOrDefault("Alice", 0);
        System.out.println(aliceScore); // Output: 90

        // Mengambil nilai untuk key "David" (yang tidak ada)
        int davidScore = scores.getOrDefault("David", 80);
        System.out.println(davidScore); // Output: 80
    }
}
