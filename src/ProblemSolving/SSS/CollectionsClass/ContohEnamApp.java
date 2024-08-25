package ProblemSolving.SSS.CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.shuffle;

public class ContohEnamApp {

    public static void main(String[] args) {

        //6. Mengacak posisi element di list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers); // Output: [1, 2, 3, 4, 5]

        shuffle(numbers);
        System.out.println(numbers); // Output: [4, 2, 1, 5, 3] (atau urutan acak lainnya)
    }
}
