package ProblemSolving.ppp.LegacyCollection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackClassApp {
    public static void main(String[] args) {

        Stack<String> testData = new Stack<>();
        testData.push("AUDY");
        testData.push("BUDI");
        testData.push("CANDRA");

        while (!testData.isEmpty()) {
            System.out.println(testData.pop());
        }
    }
}
