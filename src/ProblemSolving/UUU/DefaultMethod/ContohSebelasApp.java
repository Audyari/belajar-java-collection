package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohSebelasApp {
    public static void main(String[] args) {

        //Ubah key dengan value hasil function jika sudah ada
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mengubah nilai "Alice" dari 90 menjadi 95
        scores.computeIfPresent("Alice", (k, v) -> v + 5);
        System.out.println("Alice's new score: " + scores.get("Alice")); // Output: Alice's new score: 95

        // Mencoba mengubah nilai "David" (tidak ada dalam Map)
        scores.computeIfPresent("David", (k, v) -> v + 10);
        System.out.println("David's score: " + scores.get("David")); // Output: David's score: null

        // Mencetak semua key-value dalam Map
        scores.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Output:
        // Key: Alice, Value: 95
        // Key: Bob, Value: 85
        // Key: Charlie, Value: 92
    }
}
