package ProblemSolving.TTT.AbstractCollection;

import java.util.Queue;

public class AbstractCollectionApp {
    public static void main(String[] args) {

       // BIKIN QUEUE MANUAL PAKE ABSTRAKQUEUE
        // Buat sebuah antrian
        Queue<String> queue = new bikinQueueManual<>();

        // Menambahkan elemen ke dalam antrian
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("David");

        // Mencetak isi antrian
        System.out.println("Antrian: " + queue);

        // Mengambil elemen di depan antrian tanpa menghapusnya
        String front = queue.peek();
        System.out.println("Elemen di depan antrian: " + front);

        // Mengambil dan menghapus elemen di depan antrian
        String removedElement = queue.poll();
        System.out.println("Elemen yang diambil: " + removedElement);

        // Mencetak isi antrian setelah pengambilan elemen
        System.out.println("Antrian setelah pengambilan: " + queue);

        // Memeriksa apakah antrian kosong
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian tidak kosong");
        }

        System.out.println("TESTING");

        System.out.println();
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
