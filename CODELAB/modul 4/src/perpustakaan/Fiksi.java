package Perpustakaan;

public class Fiksi extends Buku {
    public String genre;

    public Fiksi(String Title, String Author, String genre){
        super (Title, Author);
        this.genre = genre;

    }

    @Override
    public void DisplayInfo(){
        System.out.println("===================================");
        System.out.println("Information About Fiction Book: ");
        System.out.println("Title: " + Title + " Author: " + Author + " (Genre: " + genre +")");
    }
}
