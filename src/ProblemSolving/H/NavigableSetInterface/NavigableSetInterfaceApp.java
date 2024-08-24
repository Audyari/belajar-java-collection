package ProblemSolving.H.NavigableSetInterface;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetInterfaceApp {
    public static void main(String[] args) {
        NavigableSet<String> testData = new TreeSet<>();
        testData.addAll(Set.of("Audy","BUDI","CANDRA","DIKI","ENGGI","FANTA"));

        NavigableSet<String> dataDisending = testData.descendingSet();
        NavigableSet<String> dataHead = testData.headSet("ENGGI",false);
        NavigableSet<String> dataTail = testData.tailSet("ENGGI",true);

        for(var tampildata:testData){
            System.out.println(tampildata);
        }

        System.out.println("");
        System.out.println("");

        for(var tampildata:dataDisending){
            System.out.println(tampildata);
        }

        System.out.println("");
        System.out.println("");

        for(var tampildata:dataHead){
            System.out.println(tampildata);
        }

        System.out.println("");
        System.out.println("");

        for(var tampildata:dataTail){
            System.out.println(tampildata);
        }


    }
}
