package ProblemSolving.A.IterableIteratorInterface;

import java.util.Iterator;
import java.util.List;

public class IterableIteratorInterface {

    public static void main(String[] args) {
        Iterable<Object> testData = List.of("AUDY","CUDY","AANDRA",1);
        Iterator<Object> testData1 = testData.iterator();

        for (var Data:testData){
            System.out.println(Data);
        }

        while (testData1.hasNext()){
            Object Data = testData1.next();
            System.out.println(Data);
        }
    }

}
