package ProblemSolving.SSS.CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContohKeLima {
    public static void main(String[] args) {

        //5. Membalikkan seluruh element di list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers); // Output: [1, 2, 3, 4, 5]

        Collections.reverse(numbers);
        System.out.println(numbers); // Output: [5, 4, 3, 2, 1]
    }
}
