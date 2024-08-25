package ProblemSolving.UUU.DefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class ContohKeTujuhApp {

    public static void main(String[] args) {

        //Simpan data ke map jika belum ada
        Map<String, Integer> scores = new HashMap<>();

        // Menyimpan data baru ke dalam Map
        scores.putIfAbsent("Alice", 90);
        scores.putIfAbsent("Bob", 85);
        scores.putIfAbsent("Charlie", 92);

        // Mencoba menyimpan data yang sudah ada
        scores.putIfAbsent("Alice", 95);

        // Mencetak semua key-value dalam Map
        scores.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Output:
        // Key: Alice, Value: 90
        // Key: Bob, Value: 85
        // Key: Charlie, Value: 92
    }
}
