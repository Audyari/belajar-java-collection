import java.util.*;

public class Perpustakaan {
    private Map<String, NavigableSet<String>> bukuPerGenre;

    public Perpustakaan() {
        bukuPerGenre = new HashMap<>();

        // Inisialisasi beberapa buku
        NavigableSet<String> fiksi = new TreeSet<>();
        fiksi.add("Harry Potter");
        fiksi.add("Lord of the Rings");
        bukuPerGenre.put("Fiksi", fiksi);

        NavigableSet<String> nonFiksi = new TreeSet<>();
        nonFiksi.add("A Brief History of Time");
        nonFiksi.add("Sapiens");
        bukuPerGenre.put("Non-Fiksi", nonFiksi);
    }

    public NavigableSet<String> getDaftarBuku(String genre) {
        return bukuPerGenre.getOrDefault(genre, Collections.emptyNavigableSet());
    }

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        // Mencoba genre yang ada
        System.out.println("Buku Fiksi: " + perpus.getDaftarBuku("Fiksi"));

        // Mencoba genre yang tidak ada
        System.out.println("Buku Puisi: " + perpus.getDaftarBuku("Puisi"));

        // Mencoba genre yang ada
        System.out.println("Buku Fiksi: " + perpus.getDaftarBuku("Non-Fiksi"));
    }
}