package ProblemSolving.MM.SortedMapInterface;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeSetAppPakeComparator {




    public static void main(String[] args) {

        Comparator<String> perbandinganData = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> testData = new TreeMap<>(perbandinganData);
        testData.put("ASatu", "AUDYARI");
        testData.put("BDua", "BUDI");
        testData.put("CTiga", "CANDRA");

        for (var data : testData.entrySet()) {
            System.out.println(data);
        }
    }
}

