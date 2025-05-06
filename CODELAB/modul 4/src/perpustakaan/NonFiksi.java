package Perpustakaan;

public class NonFiksi extends Buku {
    public String genre;

    public NonFiksi(String Title, String Author, String genre){
        super(Title, Author);
        this.genre = genre;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("\nInformation About NonFiction Book: ");
        System.out.println("Title: " + Title + " Author: " + Author + " (Genre: " + genre +")");
    }
}
