package ProblemSolving.UUU.DefaultMethod;

import java.util.Arrays;
import java.util.List;

public class ContohSatuApp {

    public static void main(String[] args) {

        //Melakukan iterasi seluruh data collection
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Menggunakan forEach()
        names.forEach(name -> System.out.println(name));

        // Output:
        // Alice
        // Bob
        // Charlie
        // David
    }
}
