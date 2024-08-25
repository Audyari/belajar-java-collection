package ProblemSolving.NN.NavigableMapInterface;

import java.util.Collections;

import java.util.NavigableMap;

public class ContohKasusSatu {
    public static void main(String[] args) {

        //1 . Membuat immutable navigable set kosong
        // Membuat NavigableMap kosong yang tidak dapat diubah
        NavigableMap<String, Integer> emptyMap = Collections.emptyNavigableMap();

        System.out.println("Empty map: " + emptyMap);

        // Mencoba mengubah emptyMap
        try {
            emptyMap.put("Apple", 1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Tidak dapat mengubah emptyMap");
        }

        // Mencoba mengakses elemen dalam emptyMap
        try {
            System.out.println("Value of 'Apple': " + emptyMap.get("Apple"));
        } catch (NullPointerException e) {
            System.out.println("Tidak ada elemen 'Apple' dalam emptyMap");
        }
    }
}