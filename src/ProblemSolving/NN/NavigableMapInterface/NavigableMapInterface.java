package ProblemSolving.NN.NavigableMapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterface {
    public static void main(String[] args) {
        NavigableMap<String, String> testData = new TreeMap<>();

        testData.put("ASATU","AUDYARI");
        testData.put("BDUA","BUDI");
        testData.put("CTIGA","CANDRA");

        for(var data:testData.keySet()){
            System.out.println(data);
        }

        System.out.println(testData.lowerKey("BDUA"));
        System.out.println(testData.higherKey("BDUA"));

        System.out.println("");

        System.out.println(testData.floorKey("DUA"));
        System.out.println(testData.ceilingKey("DUA"));

        System.out.println("");

        System.out.println(testData.descendingMap());



    }
}
