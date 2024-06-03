/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemperkuliahan.UI;

import java.util.Scanner;

/**
 *
 * @author A-27
 */
public class TextUI (){
            
    private static Scanner scanner = new Scanner(System.in);
    
    public TextUI(){
        System.out.println("Ini adalah konstruktor dari Text UI");   
    }
            
    public void run() (
                    while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    handlePerkuliahanMenu();
                    break;
                case 2:
                    handleDosenMenu();
                    break;
                case 3:
                    handleStafMenu();
                    break;
                case 4:
                    handleMahasiswaMenu();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");
        System.out.println("1. Data Perkuliahan");
        System.out.println("2. Data Dosen");
        System.out.println("3. Data Staf");
        System.out.println("4. Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private static void handlePerkuliahanMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Perkuliahan");
            System.out.println("2. Tambah Perkuliahan");
            System.out.println("3. Edit Perkuliahan");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Perkuliahan
                    System.out.println("Menampilkan daftar perkuliahan.");
                    break;
                case 2:
                    // Implement logic for adding Perkuliahan
                    System.out.println("Menambahkan perkuliahan baru.");
                    break;
                case 3:
                    // Implement logic for editing Perkuliahan
                    System.out.println("Mengedit data perkuliahan.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleDosenMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Dosen");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Dosen
                    System.out.println("Menampilkan daftar dosen.");
                    break;
                case 2:
                    // Implement logic for adding Dosen
                    System.out.println("Menambahkan dosen baru.");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleStafMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Staf");
            System.out.println("2. Tambah Staf");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Staf
                    System.out.println("Menampilkan daftar staf.");
                    break;
                case 2:
                    // Implement logic for adding Staf
                    System.out.println("Menambahkan staf baru.");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleMahasiswaMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Mahasiswa
                    System.out.println("Menampilkan daftar mahasiswa.");
                    break;
                case 2:
                    // Implement logic for adding Mahasiswa
                    System.out.println("Menambahkan mahasiswa baru.");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    )
}
