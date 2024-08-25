package ProblemSolving.qqq.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        dataList.addAll(List.of("BUDI", "CANDRA", "AUDY", "PROGRAMER", "ZAMAN", "NOW"));

        for (var data : dataList) {
            System.out.println(data);
        }
        System.out.println("");

        Collections.sort(dataList);

        for (var data : dataList) {
            System.out.println(data);
        }


        Comparator<String> balikDatanya = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Collections.sort(dataList,balikDatanya);

        System.out.println(" DATA MYA DI BALIK");
        System.out.println("");

        for (var data : dataList) {
            System.out.println(data);
        }

    }
}
