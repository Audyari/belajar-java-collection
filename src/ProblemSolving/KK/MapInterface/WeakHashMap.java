package ProblemSolving.KK.MapInterface;

import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {
        //2.mengunakan WeakHashMap di Map

        Map<Integer, Integer> dataNya = new java.util.WeakHashMap<>();

        for (var i = 0; i <= 1_000_000; i++) {
            dataNya.put(i,i);
            //System.out.println(dataNya.put(i,i));
        }
        //System.out.println( dataNya.get(0));

        //garbage collection di Java, bisa dimungkinkan data di WeakHashMap akan dihapus
        System.gc();

        System.out.println(dataNya.size());

    }
}
