package ProblemSolving.F.ImmutableSet;

import java.util.Collections;
import java.util.Set;

public class ImmutableContoh2App {

    public static void main(String[] args) {

        //2. Membuat immutable set berisi 1 element

        // Membuat set berisi satu elemen yang immutable
        Set<String> singletonSet = Collections.singleton("Satu");

        // Mencoba menambah elemen ke set (akan error)
        //singletonSet.add("Dua");

        // Mencoba menghapus elemen dari set (akan error)
        //singletonSet.remove("Satu");

        // Set tetap tidak berubah
        System.out.println(singletonSet); // Output: [Satu]
    }
}
