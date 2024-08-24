package ProblemSolving.G.ImplementasiSortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImmutableSortedSetContoh2 {
    public static void main(String[] args) {

        //2. Mengubah mutable sorted set menjadi immutable

        // Membuat SortedSet mutable
        SortedSet<String> mutableSortedSet = new TreeSet<>();
        mutableSortedSet.add("Apple");
        mutableSortedSet.add("Banana");
        mutableSortedSet.add("Cherry");

        // Mengubah mutableSortedSet menjadi immutable
        SortedSet<String> immutableSortedSet = Collections.unmodifiableSortedSet(mutableSortedSet);

        // Mencoba menambahkan elemen ke immutableSortedSet akan menghasilkan UnsupportedOperationException
        immutableSortedSet.add("Durian");
    }
}