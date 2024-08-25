package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohSembilanApp {

    public static void main(String[] args) {

        //Ubah key jika value sekarang sama dengan oldValue
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mengubah nilai "Alice" dari 90 menjadi 95
        boolean replaced = scores.replace("Alice", 90, 95);
        System.out.println("Replaced? " + replaced); // Output: Replaced? true

        // Mencoba mengubah nilai "Alice" dari 90 menjadi 100 (tidak berhasil)
        replaced = scores.replace("Alice", 90, 100);
        System.out.println("Replaced? " + replaced); // Output: Replaced? false

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
