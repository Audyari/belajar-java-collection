package ProblemSolving.SSS.CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class ContohKeTujuhApp {

    public static void main(String[] args) {


        // 7.  Menukar posisi from ke to di list

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers); // Output: [1, 2, 3, 4, 5]

        swap(numbers, 0, 4);
        System.out.println(numbers); // Output: [5, 2, 3, 4, 1]
    }
}
