package ProblemSolving.MM.SortedMapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeSetApp {

    public static void main(String[] args) {
        SortedMap<String, String> testData = new TreeMap<>();
        testData.put("ASatu","AUDYARI");
        testData.put("BDua","BUDI");
        testData.put("CTiga","CANDRA");

        for(var data:testData.entrySet()){
            System.out.println(data);
        }
    }
}
