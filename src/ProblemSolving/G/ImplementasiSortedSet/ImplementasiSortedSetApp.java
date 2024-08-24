package ProblemSolving.G.ImplementasiSortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class ImplementasiSortedSetApp {

    public static void main(String[] args) {

        // Membuat TreeSet
        SortedSet<String> sortedSet = new TreeSet<>();

        // Menambahkan elemen ke TreeSet
        sortedSet.add("Jeruk");
        sortedSet.add("Apel");
        sortedSet.add("Mangga");
        sortedSet.add("Pisang");

        // Cetak isi TreeSet (terurut secara ascending)
        System.out.println(sortedSet); // Output: [Apel, Jeruk, Mangga, Pisang]

        // Mendapatkan elemen pertama dan terakhir
        System.out.println("Elemen pertama: " + sortedSet.first()); // Output: Apel
        System.out.println("Elemen terakhir: " + sortedSet.last()); // Output: Pisang

        // Mendapatkan subSet
        SortedSet<String> subSet = sortedSet.subSet("Jeruk", "Pisang");
        System.out.println(subSet); // Output: [Jeruk, Mangga]

        // Mendapatkan headSet (elemen sebelum Jeruk)
        SortedSet<String> headSet = sortedSet.headSet("Jeruk");
        System.out.println(headSet); // Output: [Apel]

        // Mendapatkan tailSet (elemen setelah Jeruk)
        SortedSet<String> tailSet = sortedSet.tailSet("Jeruk");
        System.out.println(tailSet); // Output: [Jeruk, Mangga, Pisang]

    }
}