package ProblemSolving.UUU.DefaultMethod;

import java.util.Arrays;
import java.util.List;

public class ContohTigaApp {
    public static void main(String[] args) {

        //Mengubah seluruh data di collection
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Mengubah seluruh elemen dalam List menjadi dua kali lipat
        numbers.replaceAll(n -> n * 2);

        // Output: [2, 4, 6, 8, 10]
        System.out.println(numbers);
    }
}
