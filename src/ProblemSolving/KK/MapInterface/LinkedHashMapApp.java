package ProblemSolving.KK.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

    public static void main(String[] args) {
        //4.mengunakan LinkedHashMap di Map

        Map<String, String> dataNya = new LinkedHashMap<>();
        dataNya.put("SATU","Audy");
        dataNya.put("DUA","Audy");
        dataNya.put("TIGA","Audy");


        System.out.println(dataNya);

        for(var data:dataNya.values()){
            System.out.println(data);
        }

        for(var data:dataNya.keySet()){
            System.out.println(data);
        }

        System.out.println(dataNya.size());
    }
}
