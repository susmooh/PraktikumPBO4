/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ACER
 */
public class Mobil extends Kendaraan{
    private int jumlahPintu;
    
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);//Memanggil konstruktor dari kelas induuk
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan maks mobil: "+kecepatanMaks+" km/h");
        System.out.println("Jumlah Pintu: "+jumlahPintu);
    }
}
