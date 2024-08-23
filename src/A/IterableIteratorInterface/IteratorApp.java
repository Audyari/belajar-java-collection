package A.IterableIteratorInterface;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {

    public static void main(String[] args) {

        List<String> testData = List.of("SATU","DUA","TIGA");

        Iterator<String> pakeIterator = testData.iterator();

        while (pakeIterator.hasNext()){
            String elemen = pakeIterator.next();
            System.out.println(elemen);
        }

    }


}
