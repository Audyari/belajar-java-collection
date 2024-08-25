package ProblemSolving.RRR.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> dataNya = new ArrayList<>();

        for (var i = 0; i < 1000; i++) {
            dataNya.add(i);
            //System.out.println(dataNya.add(i));
        }

        var index = Collections.binarySearch(dataNya, 50);
        System.out.println(index);

        Comparator<Integer> perbandinganData = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        System.out.println("DATA MUNDUR");

        var IndexParameterMundur = Collections.binarySearch(dataNya, 50, perbandinganData);

        System.out.println(IndexParameterMundur);
    }
}
