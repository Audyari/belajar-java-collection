package ProblemSolving.F.ImmutableSet;

import java.util.Set;

public class ImmutableContoh4App {
    public static void main(String[] args) {

        //4. Membuat immutable set dari element - element

        // Membuat set immutable dari elemen-elemen
        Set<String> immutableSet = Set.of("Satu", "Dua", "Tiga");

        // Mencoba menambah elemen ke set (akan error)
        //immutableSet.add("Empat");

        // Mencoba menghapus elemen dari set (akan error)
        //immutableSet.remove("Satu");

        // Set tetap tidak berubah
        System.out.println(immutableSet); // Output: [Satu, Dua, Tiga]

    }
}
