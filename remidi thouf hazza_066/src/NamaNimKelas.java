import java.util.Scanner;

public class NamaNimKelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa("Thouf Hazza", "202410370110066", "2C");

        System.out.println("MAHASISWA");

        while (true) {
            try {
                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                if (nama.trim().isEmpty()) {
                    throw new Exception("Nama gabole kosong bre");
                }

                System.out.print("NIM: ");
                String nim = scanner.nextLine();

                if (nim.trim().isEmpty()) {
                    throw new Exception("NIM gabole kosong bre");
                }

                System.out.print("Kelas: ");
                String kelas = scanner.nextLine();

                if (kelas.trim().isEmpty()) {
                    throw new Exception("Kelas gabole kosong bre");
                }

                if (mahasiswa.login(nama, nim, kelas)) {
                    mahasiswa.tampilkanInfo();
                    break;
                } else {
                    throw new Exception("Data beda jir coba inget inget");
                }

            } catch (Exception e) {
                System.out.println("Error jir: " + e.getMessage());
                System.out.print("Coba lagi? (iyah/tidak): ");
                if (!scanner.nextLine().equalsIgnoreCase("iyah")) {
                    System.out.println("Login batal.");
                    break;
                }
            }
        }

        scanner.close();
    }
}