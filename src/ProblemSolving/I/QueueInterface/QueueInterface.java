package ProblemSolving.I.QueueInterface;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {

        // 1. pake PriorityQueue Data Berurut
        Queue<String> testData = new PriorityQueue<>(10);

        // 2. pake ArrayDeque Data Tidak Berurut
        //Queue<String> testData = new ArrayDeque<>(10);

        //3 ArrayDeque dan LinkedList
        // ArrayDeque ; Jika Anda sering melakukan operasi penambahan atau penghapusan elemen di awal atau akhir daftar
        // LinkedList : Jika Anda sering melakukan operasi penambahan atau penghapusan elemen di tengah daftar

        //Queue<String> testData = new LinkedList<>(10);

        testData.offer("AUDY");
        testData.offer("BUDI");
        testData.offer("CANDRA");
        testData.offer("ASEP");

        System.out.println(testData.size());

        System.out.println(testData);

        for (String next = testData.poll(); next != null; next = testData.poll() ){
            System.out.println(next);
        }

        System.out.println(testData.size());

        System.out.println(testData);
    }
}