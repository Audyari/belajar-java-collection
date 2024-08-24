package ProblemSolving.J.DequeInterface;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeInterface {

    public static void main(String[] args) {
        Deque<String> testData = new LinkedList<>();

        System.out.println( testData.size());

        testData.offerLast("AUDY");
        testData.offerLast("BUDI");
        testData.offerLast("CANDRA");

        System.out.println( testData.size());

        for (var item = testData.pollLast(); item != null; item = testData.pollLast()){
            System.out.println(item);
        }
        System.out.println( testData.size());

    }
}