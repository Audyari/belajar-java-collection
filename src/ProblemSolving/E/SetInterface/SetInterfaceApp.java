package ProblemSolving.E.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceApp {
    public static void main(String[] args) {

        // HashSet dapat digunakan untuk menghilangkan duplikasi dalam sebuah kumpulan data

        Set<String> testDataHashSet = new HashSet<>();
        testDataHashSet.add("AUDY");
        testDataHashSet.add("BUDI");
        testDataHashSet.add("CANDRA");
        testDataHashSet.add("AUDY");
        testDataHashSet.add("BUDI");
        testDataHashSet.add("CANDRA");

        for (var TampilData: testDataHashSet){
            System.out.println(TampilData);
        }

    }
}
