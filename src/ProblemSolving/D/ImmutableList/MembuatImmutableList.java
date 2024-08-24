package ProblemSolving.D.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MembuatImmutableList {
    public static void main(String[] args) {

        // 1. menggunakan Membuat immutable list kosong

        List<String> emptyList = Collections.emptyList();

        // Mencoba menambahkan elemen akan menghasilkan UnsupportedOperationException
        // emptyList.add("New Item");

        // 2. Membuat immutable list berisi 1 element

        String singleElement = "Hello";
        List<String> singletonList = Collections.singletonList(singleElement);

        for (var datanya : singletonList) {
            System.out.println(datanya);
        }

        //3. Mengubah mutable list menjadi immutable

        // Membuat mutable list
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Element 1");
        mutableList.add("Element 2");
        mutableList.add("Element 3");

        // Mengubah mutable list menjadi immutable
        List<String> immutableList = Collections.unmodifiableList(mutableList);

        // Mencoba memodifikasi immutable list (akan menghasilkan UnsupportedOperationException)
        //immutableList.add("Element 4");

        //4. Membuat immutable list dari element - element

        // Membuat mutable list
        List<String> testDataMutable = new ArrayList<>();
        testDataMutable.add("Element 1");
        testDataMutable.add("Element 2");
        testDataMutable.add("Element 3");


        // Membuat immutable list dari elemen-elemen
        List<String> testDataMutable1 = List.of("Element 1", "Element 2", "Element 3");

        // Mencoba memodifikasi immutable list (akan menghasilkan UnsupportedOperationException)
        testDataMutable.add("Element 4");

        for(var panggil : testDataMutable1 ){
            System.out.println(panggil);
        }
    }
}
