package ProblemSolving.G.ImplementasiSortedSet;

import java.util.Collections;
import java.util.SortedSet;

public class ImmutableSortedSetContoh1 {

    public static void main(String[] args) {

        //1. Membuat immutable sorted set kosong

        SortedSet<String> emptySortedSet = Collections.emptySortedSet();

        // Mencoba menambahkan elemen ke emptySortedSet akan menghasilkan UnsupportedOperationException
        emptySortedSet.add("Hello");
    }
}

