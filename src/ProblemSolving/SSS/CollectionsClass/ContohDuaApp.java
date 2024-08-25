package ProblemSolving.SSS.CollectionsClass;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.frequency;

public class ContohDuaApp {
    public static void main(String[] args) {

        //2. Mengambil berapa banyak element yang sama dengan object
        List<String> list = Arrays.asList("apple", "banana", "cherry", "banana");
        int data = frequency(list, "banana");
        System.out.println(data); // Output: 2
    }
}
