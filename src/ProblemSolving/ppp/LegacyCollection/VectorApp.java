package ProblemSolving.ppp.LegacyCollection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> testData = new Vector<>();
        testData.add("AUDY");
        testData.add("Budi");
        testData.add("Candra");

        for(var data:testData){
            System.out.println(data);
        }
    }
}
