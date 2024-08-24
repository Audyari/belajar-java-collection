package ProblemSolving.KK.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

    public static void main(String[] args) {

        //1.mengunakan HashMap di Map

        Map<Integer, String> dataNya = new HashMap<>();
        dataNya.put(1,"Audyari");
        dataNya.put(2,"Budi");
        dataNya.put(3,"Candra");

        System.out.println(dataNya);

        System.out.println(dataNya.get(1));
        System.out.println(dataNya.get(2));
        System.out.println(dataNya.get(3));






    }
}
