/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ACER
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    //setter dan getter nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUsia() {
        return usia;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
       
    public String getPekerjaan() {
        return pekerjaan;
    }
    
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    //menampilkan nama dan pekerjaan
    public void tampilkanInfoManusia() {
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Pekerjaan: "+pekerjaan);
    }
}
