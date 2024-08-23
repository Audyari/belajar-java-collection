package ProblemSolving.C.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List<String> testData = new ArrayList<>();

        //  Kalo mau Pake LinkedList
        //  List<String> testData = new LinkedList<>();

        testData.add("AUDY");
        testData.add("BUDI");
        testData.add("CANDRA");

        testData.set(1,"DIKI");

        for (var isiData: testData){
            System.out.println(isiData);
        }

        System.out.println("NAMPILIN BERDASARKAN INDEX");

        System.out.println(testData.get(0));
        System.out.println(testData.get(1));

        //Hapus Data

        System.out.println("HAPUS DATA");
        testData.remove(1);
        testData.remove("AUDY");

        for (var isiData: testData){
            System.out.println(isiData);
        }




    }
}
