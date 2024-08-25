package ProblemSolving.SSS.CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.copy;

public class CollectionsClassAppSatu {
    public static void main(String[] args) {

        //1. Copy semua data dari listFrom ke listTo

        List<String> listTo = new ArrayList<>();
        listTo = Arrays.asList("apple", "banana", "cherry");

        copy(listTo, listTo);

        System.out.println(listTo); // Output: [apple, banana, cherry]
    }
}