/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ACER
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter and Setter for merek
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: "+nama);
        System.out.println("Kecepatan Maksimal :"+kecepatanMaks+" km/h");
        System.out.println("Jenis Mesin: "+jenisMesin);
    }
}
