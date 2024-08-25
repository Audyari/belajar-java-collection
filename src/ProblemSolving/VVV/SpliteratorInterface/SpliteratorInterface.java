package ProblemSolving.VVV.SpliteratorInterface;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorInterface {

    public static void main(String[] args) {
        List<String> dataNya = List.of("AUDY", "BUDI", "CANDRA", "PROGRAMER", "ZAMAN", "NOW");

        Spliterator<String> Spliterator1 = dataNya.spliterator();
        Spliterator<String> Spliterator2 = Spliterator1.trySplit();
        Spliterator<String> Spliterator3 = Spliterator2.trySplit();

        System.out.println(Spliterator1.estimateSize());
        System.out.println(Spliterator2.estimateSize());
        System.out.println(Spliterator3.estimateSize());

        Spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("");

        Spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}

