package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohDelapanApp {
    public static void main(String[] args) {

        //Hapus jika key-value nya sama
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mencoba menghapus entri dengan key "Alice" dan value 90
        boolean removed = scores.remove("Alice", 90);
        System.out.println("Removed? " + removed); // Output: Removed? true

        // Mencoba menghapus entri dengan key "Alice" dan value 95 (tidak ada)
        removed = scores.remove("Alice", 95);
        System.out.println("Removed? " + removed); // Output: Removed? false

        // Mencetak semua key-value dalam Map
        scores.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Output:
        // Key: Bob, Value: 85
        // Key: Charlie, Value: 92
    }
}
