package Perpustakaan;

public abstract class Buku {
    protected String Title;
    protected String Author;

    public Buku(String Title, String Author){
        this.Title = Title;
        this.Author = Author;
    }

    public abstract void DisplayInfo();
}
