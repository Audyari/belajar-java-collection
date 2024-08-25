package ProblemSolving.ooo.EntryMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {

    public static void main(String[] args) {
        Map<String, String> testData = new HashMap<>();
        testData.put("Audyari", "Audyari");
        testData.put("Budi", "Budi");
        testData.put("Candra", "Candra");

        for (var dataDua: testData.keySet()){
            System.out.println(dataDua);
        }

        for (var dataDua: testData.values()){
            System.out.println(dataDua);
        }

        //Memisahkan key dengan value
        Set<Map.Entry<String, String>> entries = testData.entrySet();

        for (var data : entries) {
            System.out.println("==========");
            System.out.println("KEY DATA : " + data.getKey());
            System.out.println("VALUE DATA : "+data.getValue());
        }


    }
}
