package ProblemSolving.B.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionInterface {

    public static void main(String[] args) {

        Collection<String> dataCollection = new ArrayList<>();

        dataCollection.add("AUDY");
        dataCollection.add("BUDI");
        dataCollection.add("CANDRA");
        dataCollection.addAll(Arrays.asList("DIDI", "EKO"));

        // Cast ke ArrayList agar bisa mengubah elemen pada indeks tertentu
        ArrayList<String> dataList = (ArrayList<String>) dataCollection;
        dataList.set(1, "UPDATED AUDY");

        //Menghapus Data nya

        dataCollection.remove("CANDRA");
        dataCollection.removeAll(Arrays.asList("EKO", "DIDI"));

        for (var panggilData : dataCollection) {
            System.out.println(panggilData);
        }

        //Mengecek Data

        System.out.println(
                dataCollection.contains("AUDY")
        );

        System.out.println(
                dataCollection.containsAll(Arrays.asList("AUDY", "UPDATED AUDY"))
        );

        //Ukuran Data
        System.out.println(dataCollection.size());

    }
}
