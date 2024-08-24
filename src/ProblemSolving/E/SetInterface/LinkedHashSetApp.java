package ProblemSolving.E.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {
        // LinkedHashSet dapat digunakan untuk menghilangkan duplikasi dalam sebuah kumpulan data
        // Mempertahankan Urutan Elemen:

        Set<String> testDataHashSet = new LinkedHashSet<>();

        testDataHashSet.add("Candra");
        testDataHashSet.add("Budi");
        testDataHashSet.add("Audy");

        testDataHashSet.add("Candra");
        testDataHashSet.add("Budi");
        testDataHashSet.add("Audy");

        for (var TampilData : testDataHashSet) {
            System.out.println(TampilData);
        }

    }
}

