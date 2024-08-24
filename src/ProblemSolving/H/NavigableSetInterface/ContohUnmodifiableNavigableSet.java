package ProblemSolving.H.NavigableSetInterface;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.*;

public class ContohUnmodifiableNavigableSet {

    public static void main(String[] args) {

        // Membuat NavigableSet mutable
        NavigableSet<Integer> mutableSet = new TreeSet<>();
        mutableSet.add(1);
        mutableSet.add(2);
        mutableSet.add(3);

        // Membuat view immutable
        NavigableSet<Integer> immutableSet = Collections.unmodifiableNavigableSet(mutableSet);

        System.out.println("Immutable set: " + immutableSet);

        // Mencoba memodifikasi immutable set (akan throw exception)
        try {
            immutableSet.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Tidak bisa menambahkan elemen ke immutable set" + e);
        }

        // Memodifikasi set asli
        mutableSet.add(4);

        // Perubahan tercermin di immutable view
        System.out.println("Immutable set setelah modifikasi set asli: " + immutableSet);

        for (var testdata:immutableSet ){
            System.out.println(testdata);
        }


    }
}