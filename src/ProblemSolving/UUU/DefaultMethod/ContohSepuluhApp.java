package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohSepuluhApp {
    public static void main(String[] args) {

        //Ubah key dengan value hasil function jika belum ada
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mengambil nilai "Alice" dari Map
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore); // Output: Alice's score: 90

        // Mengambil nilai "David" dari Map (tidak ada), lalu menghitung dan menambahkan ke Map
        int davidScore = scores.computeIfAbsent("David", k -> 80);
        System.out.println("David's score: " + davidScore); // Output: David's score: 80

        // Mencetak semua key-value dalam Map
        scores.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Output:
        // Key: Alice, Value: 90
        // Key: Bob, Value: 85
        // Key: Charlie, Value: 92
        // Key: David, Value: 80
    }
}
