// File: Mahasiswa.java
package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa Login Sukses: " + getNama());
    }

    @Override
    public void reportItem() {
        System.out.println("Melaporkan barang...");
    }

    @Override
    public void viewReportedItems() {
        System.out.println("Melihat laporan barang...");
    }
}