package ProblemSolving.F.ImmutableSet;

import java.util.Collections;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        // 1. Membuat immutable set kosong
        // Membuat set kosong yang immutable
        Set<String> emptySet = Collections.emptySet();

        // Mencoba menambah elemen ke set kosong (akan error)
        //emptySet.add("Satu");

        // Mencoba menghapus elemen dari set kosong (akan error)
        //emptySet.remove("Satu");

        // Set kosong tetap tidak berubah
        System.out.println(emptySet); // Output: []

    }
}
