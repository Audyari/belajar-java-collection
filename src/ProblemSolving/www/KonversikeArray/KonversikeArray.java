package ProblemSolving.www.KonversikeArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class KonversikeArray {
    public static void main(String[] args) {
        List<String> dataNya = List.of("AUDY","BADU","CANDRA");

        //Mengubah collection menjadi array
        Object[] dataObjek = dataNya.toArray();

        //Mengubah collection menjadi array T
        String[] dataString = dataNya.toArray(new String[]{});

        System.out.println(Arrays.toString(dataObjek));
        System.out.println(Arrays.toString(dataString));
    }
}
