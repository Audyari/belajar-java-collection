package ProblemSolving.ppp.LegacyCollection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> testData = new Hashtable<>();
        testData.put("Audy", "VALUE AUDY");
        testData.put("BUDI", "VALUE BUDI");
        testData.put("CANDRA", "VALUE Candra");

        for (var panggilData : testData.entrySet()) {
            System.out.println("KEY NYA : " + panggilData.getKey() + " VALUE NYA : " + panggilData.getValue());
        }
    }
}
