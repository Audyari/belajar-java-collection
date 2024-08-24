package ProblemSolving.KK.MapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        //3.mengunakan IdentityHashMap di Map
        String key1 = "Nama.Depan";
        String data = "Nama";
        String data2 = "Depan";
        String key2 = data+'.'+data2;

        Map<String, String> dataNya = new IdentityHashMap<>();

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        dataNya.put(key1,"AUDYARI");
        dataNya.put(key2,"BANDUNG");

        System.out.println(dataNya);

        System.out.println(dataNya.size());
    }
}
