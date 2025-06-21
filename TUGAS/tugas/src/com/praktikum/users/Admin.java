// File: Admin.java
package com.praktikum.users;

import com.praktikum.actions.AdminActions;

public class Admin extends User implements AdminActions {
    private String username = "admin";
    private String password = "admin123";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Login Sukses: " + getNama());
    }

    @Override
    public void manageItems() {
        System.out.println("Mengelola barang...");
    }

    @Override
    public void manageUsers() {
        System.out.println("Mengelola pengguna...");
    }
}