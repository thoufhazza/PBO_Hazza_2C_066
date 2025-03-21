import java.util.Scanner;

class Akun {
    private String username;
    private String password;

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }
}

public class Main {
    public static void main(String[] args) {
        Akun akun = new Akun("hazza123", "hazza123");
        Mahasiswa mahasiswa = new Mahasiswa("thouf hazza", "202410370110066");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        
        if (akun.login(username, password)) {
            System.out.println("Login berhasil!");
            System.out.println("Data Mahasiswa:");
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }

        scanner.close();
    }
}