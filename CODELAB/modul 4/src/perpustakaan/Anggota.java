package Perpustakaan;


public class Anggota implements Peminjaman {
    public String  Name;
    public String  Id;

    public Anggota(String Name, String Id){
        this.Name = Name;
        this.Id = Id;
    }
    public void pinjamBuku(String Title){
        System.out.println(Name + " Memimjam Buku: " + Title );
    }
    @Override
    public void pinjamBuku(String Title, int Durasi) {
        System.out.println(Name + " Telah Meminjam Buku Berjudul: " + Title + " Dengan Durasi: " + Durasi + " Hari");
    }

    @Override
    public void kembalikanBuku(String Title) {
        System.out.println(Name + " Telah Mengembalikan Buku yang berjudul: " + Title);
    }
}
