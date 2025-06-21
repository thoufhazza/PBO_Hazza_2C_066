class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;

    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public boolean login(String inputNama, String inputNim, String inputKelas) {
        return nama.equalsIgnoreCase(inputNama) &&
                nim.equals(inputNim) &&
                kelas.equalsIgnoreCase(inputKelas);
    }

    public void tampilkanInfo() {
        System.out.println("\n Login berhasil!");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
    }
}