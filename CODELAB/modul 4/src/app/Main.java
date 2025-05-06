package App;
import Perpustakaan.Anggota;
import Perpustakaan.Fiksi;
import Perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Fiksi bukuFiksi = new Fiksi("Naruto", "Masashi", "Fiksi");
        NonFiksi bukuNonfiksi = new NonFiksi("Filosofi Teras", "Setyo", "NonFiksi");

        Anggota anggota1 = new Anggota("Miff", "073");
        Anggota anggota2 = new Anggota("Hazza", "066");


        bukuFiksi.DisplayInfo();
        bukuNonfiksi.DisplayInfo();

        System.out.println("\n=======Anggota============");
        System.out.println("Nama: " + anggota1.Name + " Id: " + anggota1.Id);
        System.out.println("Nama: " + anggota2.Name + " Id: " + anggota2.Id);

        System.out.println("\n=======List Peminjam Buku=====");
        anggota1.pinjamBuku("Naruto", 7);
        anggota2.pinjamBuku("Filosofi Teras", 3);

        System.out.println("\n=====List Pengembalian Buku===========");
        anggota1.kembalikanBuku("Naruto");
        anggota2.kembalikanBuku("Filosofi Teras");

    }

}
