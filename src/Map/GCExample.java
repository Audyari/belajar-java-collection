package Map;

public class GCExample {

    public static void main(String[] args) {

        // Tanpa memanggil System.gc()
        System.out.println("Tanpa memanggil System.gc():");
        testWithoutGC();

        // Dengan memanggil System.gc()
        System.out.println("\nDengan memanggil System.gc():");
        testWithGC();
    }

    private static void testWithoutGC() {
        // Buat objek besar yang mengonsumsi banyak memori
        byte[] largeArray = new byte[100_000_000]; // 100 MB

        // Lakukan operasi lain...
        doSomething(largeArray);

        // Objek largeArray tidak lagi digunakan, tapi belum tentu langsung di-GC
        System.out.println("Memori bebas: " + Runtime.getRuntime().freeMemory() + " bytes");
    }

    private static void testWithGC() {
        // Buat objek besar yang mengonsumsi banyak memori
        byte[] largeArray = new byte[100_000_000]; // 100 MB

        // Lakukan operasi lain...
        doSomething(largeArray);

        // Panggil garbage collection secara manual
        System.gc();

        // Objek largeArray sudah pasti telah dibebaskan dari memori
        System.out.println("Memori bebas: " + Runtime.getRuntime().freeMemory() + " bytes");
    }

    private static void doSomething(byte[] array) {
        // Lakukan operasi dengan array
        // ...
    }
}

