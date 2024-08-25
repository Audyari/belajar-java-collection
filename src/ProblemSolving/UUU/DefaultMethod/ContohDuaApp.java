package ProblemSolving.UUU.DefaultMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContohDuaApp {
    public static void main(String[] args) {

        // Menggunakan ArrayList sebagai List yang dapat dimodifikasi
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Menghapus angka genap dari List
        numbers.removeIf(n -> n % 2 == 0);

        // Output: [1, 3, 5, 7, 9]
        System.out.println(numbers);
    }
}