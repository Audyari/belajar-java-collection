package ProblemSolving.F.ImmutableSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableContoh3App {
    public static void main(String[] args) {

        //3. Mengubah mutable set menjadi immutable

        // Membuat set mutable
        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Satu");
        mutableSet.add("Dua");
        mutableSet.add("Tiga");

        // Membuat set immutable dari set mutable
        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);

        // Mencoba menambah elemen ke set immutable (akan error)
        //immutableSet.add("Empat");

        // Mencoba menghapus elemen dari set immutable (akan error)
        //immutableSet.remove("Satu");

        // Set immutable tetap tidak berubah
        System.out.println(immutableSet); // Output: [Satu, Dua, Tiga]

        // Set mutable asli masih dapat diubah
        mutableSet.add("Empat");
        System.out.println(mutableSet); // Output: [Satu, Dua, Tiga, Empat]
    }
}
