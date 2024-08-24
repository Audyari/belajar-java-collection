package ProblemSolving.E.SetInterface;

import java.util.EnumSet;

public class ContohLainEnumSet {

    public static void main(String[] args) {

        // Buat EnumSet untuk hari kerja
        EnumSet<HariDalam1Minggu> hariKerja = EnumSet.of(HariDalam1Minggu.SENIN, HariDalam1Minggu.SELASA, HariDalam1Minggu.RABU, HariDalam1Minggu.KAMIS, HariDalam1Minggu.JUMAT);

        // Tambah hari Sabtu ke EnumSet
        hariKerja.add(HariDalam1Minggu.SABTU);

        // Hapus hari Jumat dari EnumSet
        hariKerja.remove(HariDalam1Minggu.JUMAT);

        // Cek apakah hari Senin ada dalam EnumSet
        boolean apakahSenenAda = hariKerja.contains(HariDalam1Minggu.SENIN);

        // Tampilkan hari-hari kerja
        for (HariDalam1Minggu hari : hariKerja) {
            System.out.println(hari);
        }
    }

    public enum HariDalam1Minggu {
        SENIN,
        SELASA,
        RABU,
        KAMIS,
        JUMAT,
        SABTU,
        MINGGU
    }
}
