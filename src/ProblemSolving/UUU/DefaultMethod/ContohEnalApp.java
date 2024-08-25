package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohEnalApp {

    public static void main(String[] args) {

        //Mengubah seluruh data value
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Mengubah seluruh nilai dalam Map menjadi nilai berlipat ganda
        scores.replaceAll((key, value) -> value * 2);

        // Mencetak semua key-value dalam Map setelah diubah
        scores.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Output:
        // Key: Alice, Value: 180
        // Key: Bob, Value: 170
        // Key: Charlie, Value: 184
    }
}
